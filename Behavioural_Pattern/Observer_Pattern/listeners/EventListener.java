package Observer_Pattern.listeners;

import java.io.File;
public interface EventListener {
    // in update we can also pass event object it self to fetch any info about event
    void update(String eventType,File file);
}
