package api.rest_v1.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.persistence.Version;

@Data
@Document("location")
public class locationNode {
    @Id
    private String id;

    @Version
    private int version;

    private int nodeId;
    private String name;
    private String location;

    public locationNode(String Id, int NodeId, String Name, String Location) {
        super();
        this.id = Id;
        this.nodeId = NodeId;
        this.name = Name;
        this.location = Location;
    }
}
