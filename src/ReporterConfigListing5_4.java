/** ReporterConfig.java listing 5.4 */

import programFiles.Property;

import java.util.ArrayList;
import java.util.List;

public class ReporterConfigListing5_4 {

    private String m_className;

    private List<Property> m_properties = new ArrayList<Property>();


    public void addProperty(Property property) {

        m_properties.add(property);

    }
}
