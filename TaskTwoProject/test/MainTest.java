import org.junit.jupiter.api.Test;
import java.awt.*;
import javax.swing.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testFrameComponents() {
        BorderLayoutFrame frame = new BorderLayoutFrame();

        assertEquals("BorderLayout ", frame.getTitle());
        assertEquals(600, frame.getWidth());
        assertEquals(400, frame.getHeight());

        assertTrue(frame.getContentPane().getComponentCount() >= 4, "Should have at least 4 main components");
    }

    @Test
    void testWestPanelButtonCount() {
        BorderLayoutFrame frame = new BorderLayoutFrame();

        // Find the JPanel among the frame's children
        JPanel westPanel = null;
        for (Component c : frame.getContentPane().getComponents()) {
            if (c instanceof JPanel) {
                westPanel = (JPanel) c;
                break;
            }
        }

        assertNotNull(westPanel, "Could not find the west panel");

        int buttonCount = 0;
        for (Component c : westPanel.getComponents()) {
            if (c instanceof JButton) buttonCount++;
        }

        assertEquals(3, buttonCount, "The west panel should contain 3 buttons");
    }
}