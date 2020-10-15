package OOA;

/**
 * DemoA
 */
@CustomAnnotation(name = "im in class", value = "world")
class DemoA {
    @CustomAnnotation(name = "im in field", value = "world")
    String fieldA;

    @CustomAnnotation(name = "im in method ", value = "world")
    void FnA(@CustomAnnotation(name = "im in parameter", value = "world") int x) {
    }
}

public class DemoAnnotation {
    public static void main(String[] args) {
        var annotations = DemoA.class.getAnnotations();
        for (var annotation : annotations) {
            if (annotation instanceof CustomAnnotation) {
                CustomAnnotation customAnnotation = (CustomAnnotation) annotation;
                System.out.println("name:" + customAnnotation.name());
                System.out.println("value:" + customAnnotation.value());
            }
        }
    }
}
