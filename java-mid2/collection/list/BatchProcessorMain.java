package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>(); //x001
        MyLinkedList<Integer> list = new MyLinkedList<>(); //x002

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}