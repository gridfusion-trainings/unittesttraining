package trading;

import trading.dto.Stock;

public interface MarketWatcher {
   Stock getQuote(String symbol);
}
