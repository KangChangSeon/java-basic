//package Day12;
//
//enum SingletonEnum {
//    INSTANCE;
//
//    private final Client dbClient;
//
//    SingletonEnum(){
//        dbClient = Database.getClient();
//    }
//
//    public static SingletonEnum getInstance(){
//        return INSTANCE;
//    }
//    public Client getClient(){
//        return dbClient;
//    }
//}
//
//public static void main(String[] args) {
//    SingletonEnum singletonEnum = SingletonEnum.getInstance();
//    SingletonEnum.getClient();
//}