package api.rest_v1.Respository;

import api.rest_v1.Model.locationNode;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface locationRepository
        extends ReactiveMongoRepository<locationNode, String> {

    @Query("{'productId': { $exists: true}}")
    Flux<locationNode> findAllByProductID(int productId);

    @Query("{'lcoation': { $exists: true}}")
    Flux<locationNode> findAllByLocation(String location);

    Flux<locationNode> findByproductId(int productId);
}
