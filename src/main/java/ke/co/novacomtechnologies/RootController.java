package ke.co.novacomtechnologies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/")    //you actually don't need this, putting it here for clarity purposes
public class RootController
{
    @RequestMapping("/root/a")
    public String getRootA()
    {
        return "/root/a";
    }

    @RequestMapping("/root/b")
    public String getRootB()
    {
        return "/root/b";
    }

    /**
     * The catch-all with a redirect
     *
     * @param response
     * @throws IOException
     */
    @RequestMapping("/**") // or @RequestMapping("**")
    public void getDefault(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("https://google.com");
    }
}
