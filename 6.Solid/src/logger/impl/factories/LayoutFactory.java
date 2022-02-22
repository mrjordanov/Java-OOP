package logger.impl.factories;

import logger.impl.layouts.SimpleLayout;
import logger.impl.layouts.XmlLayout;
import logger.interfaces.Factory;
import logger.interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {

    @Override
    public Layout produce(String input) {
        Layout layout = null;

        if (input.equals("SimpleLayout")) {
            layout = new SimpleLayout();
        } else if (input.equals("XmlLayout")) {
            layout = new XmlLayout();
        }
        return layout;
    }
}
