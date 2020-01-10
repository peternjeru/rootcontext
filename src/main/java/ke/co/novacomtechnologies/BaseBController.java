package ke.co.novacomtechnologies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base-b")
public class BaseBController
{
    @RequestMapping("/1")
    public String getBaseBOne()
    {
        return "/base/b/1";
    }

    @RequestMapping("/2")
    public String getBaseBTwo()
    {
        return "/base/b/2";
    }

    @RequestMapping("/**")
    public String getBaseBDefault()
    {
        return "/base/b/**";
    }
}
