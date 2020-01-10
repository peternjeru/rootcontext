package ke.co.novacomtechnologies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base-a")
public class BaseAController
{
    @RequestMapping("/1")
    public String getBaseAOne()
    {
        return "/base/a/1";
    }

    @RequestMapping("/2")
    public String getBaseATwo()
    {
        return "/base/a/2";
    }

    @RequestMapping("/**")
    public String getBaseADefault()
    {
        return "/base/a/**";
    }
}
