import com.kodilla.good.patterns.challenges.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatternsMain {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever =  new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ServiceOfOrders(), new Repository());
        productOrderService.process(orderRequest);
    }
}
