/** FitNesseExpediter.java
 *  Showing horizontal alignment */

import com.sun.net.httpserver.Request;
import programFiles.FitNesseContext;
import programFiles.Response;
import programFiles.ResponseSender;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FitNesseExpediter implements ResponseSender {
    private         Socket              socket;

    private         InputStream         input;

    private         OutputStream        output;

    private         Request             request;

    private Response response;

    private FitNesseContext context;

    protected       long                requestParsingTimeLimit;

    private         long                requestProgress;

    private         long                requestParsingDeadline;

    private         boolean             hasError;

    public FitNesseExpediter(Socket          s,

                             FitNesseContext context) throws Exception

    {
        this.context =            context;

        socket =                  s;

        input =                   s.getInputStream();

        output =                  s.getOutputStream();

        requestParsingTimeLimit = 10000;

    }

    public void setRequestParsingTimeLimit(long requestTimeout) {
    }

    public void start() {
    }
}
