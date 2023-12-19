package shopapp;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemList implements Handler {

    public ItemList(Clothing[] items) {
    }

    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);

        res.headers().put("Content-Type", "Text/plain; charset=UTF-8");

        res.send();
    }
}
