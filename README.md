# nacos-disable-service
#为了处理某些需要长时间初始化，且初始化期间不想被其他服务调用的一个Start jar包
# 使用 @EnableDisableService 注解可以使服务在启动注册的时候将自己的状态设置为禁止使用
#在初始化完成之后 可以 调用 InstanceService 接口的enable方法开启
# 使用样例

#启动类

@SpringBootApplication
@EnableCaching
@EnableDisableService
@EnableDiscoveryClient
public class AppStart {

    public static final void main(String[] args){
        SpringApplication.run(AppStart.class, args);
    }
}


# InstanceService 接口使用
    @Autowired
    private InstanceService instanceService;

    @GetMapping("/disable")
    public String disable(){
        boolean disable = instanceService.disable();
        return "seccess";
    }

    @GetMapping("/enable")
    public String enable(){
        boolean enable = instanceService.enable();
        return "seccess";
    }
