package extensions;

import io.qameta.allure.Allure;
import io.qameta.allure.TmsLink;
import io.qameta.allure.TmsLinks;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSuitesExtension implements TestWatcher {
    public void testSuccessful(ExtensionContext context) {
        processTestMethod(context);
    }

    public void testFailed(ExtensionContext context, Throwable cause) {
        processTestMethod(context);
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        processTestMethod(context);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        processTestMethod(context);
    }

    private void processTestMethod(ExtensionContext context) {
        Set<String> tmsLinks = context.getTestMethod()
                .map(method -> Stream.concat(
                        Stream.ofNullable(method.getAnnotation(TmsLink.class)).map(TmsLink::value),
                        Stream.ofNullable(method.getAnnotation(TmsLinks.class)).flatMap(links ->
                                Stream.of(links.value()).map(TmsLink::value))
                ))
                .orElseGet(Stream::empty)
                .map(link -> link.split("-")[0])
                .collect(Collectors.toSet());

        tmsLinks.forEach(team -> {
            Allure.label("parentSuite", team);
            Allure.epic(team);
        });

    }

}
