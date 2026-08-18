package generated;

import generated.ModelField;

/** LLM-generated reconstruction from the supplied description. */
public class OrderByItem {
    private final ModelField field;
    public OrderByItem(ModelField field) { this.field=field; }
public String toSql() { return field.getName() + " ASC"; }
}
