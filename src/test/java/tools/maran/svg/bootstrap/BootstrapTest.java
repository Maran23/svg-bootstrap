package tools.maran.svg.bootstrap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/// Smoke tests for {@link Bootstrap}.
///
/// @author Marius Hanl
class BootstrapTest {

    @ParameterizedTest
    @EnumSource(Bootstrap.class)
    @DisplayName("Smoke test for the SVG path. Bootstrap SVGs always starts with an 'M' or 'm'.")
    void testSvgPath(Bootstrap bootstrap) {
        assertNotNull(bootstrap.path());
        assertFalse(bootstrap.path().isEmpty());

        assertTrue(bootstrap.path().startsWith("M") || bootstrap.path().startsWith("m"));
    }

}
