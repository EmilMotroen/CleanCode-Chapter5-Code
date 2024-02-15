/** FitNesseServerBetter.java
 *  Showing better formatting */

import programFiles.FitNesseContext;
import programFiles.SocketServer;

import java.net.Socket;

public class FitNesseServerBetter implements SocketServer {

    private FitNesseContext context;


    public FitNesseServerBetter(FitNesseContext context) {

        this.context = context;

    }



    public void serve(Socket s) {

        serve(s, 10000);

    }



    public void serve(Socket s, long requestTimeout) {

        try {

            FitNesseExpediter sender = new FitNesseExpediter(s, context);

            sender.setRequestParsingTimeLimit(requestTimeout);

            sender.start();

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

}