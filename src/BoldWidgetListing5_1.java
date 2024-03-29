/* listing 5.1 */

//package fitnesse.wikitext.widgets;


import programFiles.ParentWidget;
import java.util.regex.*;



public class BoldWidgetListing5_1 extends ParentWidget {

    public static final String REGEXP = "’’’.+?’’’";

    private static final Pattern pattern = Pattern.compile("’’’(.+?)’’’",

    Pattern.MULTILINE + Pattern.DOTALL

     );



    public BoldWidgetListing5_1(ParentWidget parent, String text) throws Exception {

        super(parent);

        Matcher match = pattern.matcher(text);

        match.find();

        addChildWidgets(match.group(1));

    }


    public String render() throws Exception {

        StringBuffer html = new StringBuffer("<b>");

        html.append(childHtml()).append("</b>");

        return html.toString();

    }

    private char[] childHtml() {

        return null;

    }

    private void addChildWidgets(String group) {
    }

}