//difficulty level:-easy
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (height <= 0 || width <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area;
        double requiredBuckets = 0;
        area = height * width;
        requiredBuckets = area / areaPerBucket;
        if (requiredBuckets > extraBuckets) {
            requiredBuckets = requiredBuckets - (double)extraBuckets;
            return (int) Math.ceil(requiredBuckets);
        } else if (requiredBuckets < extraBuckets) {
            requiredBuckets = extraBuckets - requiredBuckets;
            return (int) Math.ceil(requiredBuckets);
        }
        return 0;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (height <= 0 || width <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area;
        double requiredBuckets = 0;
        area = height * width;
        requiredBuckets = area / areaPerBucket;
        return (int) Math.ceil(requiredBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double requiredBuckets = 0;
        requiredBuckets = area / areaPerBucket;

        return (int) Math.ceil(requiredBuckets);
    }
}
