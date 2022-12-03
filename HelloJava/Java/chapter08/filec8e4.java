package chapter08;

public class filec8e4 {
    public static void main(String[] args) {
        Goods goods = new Goods<Integer>(666);
        System.out.println(goods.getInfo()+ "..."+goods.getInfo().getClass());
        goods.setInfo("Hot Sales");
        System.out.println(goods.getInfo()+"..."+ goods.getInfo().getClass());
    }

    private static class Goods<T> {
        private T info;

        public Goods(T info) {
            this.info = info;
        }

        public T getInfo() {
            return this.info;
        }

        public void setInfo(T info) {
            this.info = info;
        }
    }
}
