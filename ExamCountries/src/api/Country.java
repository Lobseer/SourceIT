package api;

import java.math.BigDecimal;
import java.util.List;
/**
 * Created by Lobseer on 21.10.2016.
 */
public interface Country {
        String getName();
        Long getPopulation();
        BigDecimal getSquare();
        List<State> getStates();
}

