/** ReporterConfig.java listing 5.3 */

import programFiles.Property;

import java.util.ArrayList;
import java.util.List;


public class ReporterConfigListing5_3 {


    /**
     * The class name of the reporter listener
     */

    private String m_className;


    /**
     * The properties of the reporter listener
     */

    private List<Property> m_properties = new ArrayList<Property>();


    public void addProperty(Property property) {

        m_properties.add(property);

    }

}