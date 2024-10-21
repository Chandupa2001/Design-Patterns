class ConfigurationManager{
    private static ConfigurationManager instance;

    private ConfigurationManager(){
        System.out.println("Loading...");
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public static String getConfigValue(String key){
        return "Value";
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();

        System.out.println(ConfigurationManager.getConfigValue("hello world"));
        System.out.println(configManager1 == configManager2);
    }
}
