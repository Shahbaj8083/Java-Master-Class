public class Main {
    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(0.75,0.75,0.5,0));

        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(7.25,4.3,2.35));

        System.out.println(PaintJob.getBucketCount(3.4,1.5));
        System.out.println(PaintJob.getBucketCount(6.26,2.2));
        System.out.println(PaintJob.getBucketCount(3.26,0.75));
    }

}
