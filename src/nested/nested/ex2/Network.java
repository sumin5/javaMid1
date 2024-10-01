package nested.nested.ex2;

public class Network {

    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();

    }

    // Network 객체 안에서만 서용
    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println(content);
        }
    }

}
