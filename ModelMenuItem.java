package generated;

import generated.Conditional;
import generated.WidgetLoader;

/** LLM-generated reconstruction from the supplied description. */
public class ModelMenuItem {
    private final Conditional condition;
    private final WidgetLoader renderer;
    public ModelMenuItem(Conditional condition, WidgetLoader renderer) { this.condition=condition; this.renderer=renderer; }
public String render() { if (condition.evaluate()) { renderer.load("menu-item"); return "MENU"; } return ""; }
}
