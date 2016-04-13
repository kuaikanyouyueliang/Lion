import javax.servlet.*;
import java.io.FileFilter;
import java.io.IOException;

/**
 * User:Administrator
 * Date:2016/4/13 22:04
 */
public class 过滤器的作用和原理 implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter start...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter end...");
    }

    @Override
    public void destroy() {

    }
}
