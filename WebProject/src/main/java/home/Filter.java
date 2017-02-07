package home;

import org.apache.catalina.filters.FilterBase;
import org.apache.juli.logging.Log;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Class description
 *
 * @author lobseer on 03.02.2017.
 */

public class Filter extends FilterBase {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    protected Log getLogger() {
        return null;
    }
}
