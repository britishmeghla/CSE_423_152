package generated;

import generated.ModelField;

/** LLM-generated reconstruction from the supplied description. */
public class Compare {
    private final ModelField field;
    public Compare(ModelField field) { this.field=field; }
public boolean matches(String value) { return field.getName().equals(value); }
}
