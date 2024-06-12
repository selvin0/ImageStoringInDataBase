package Storage_Service.Repository;
import Storage_Service.Entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long>
{
     Optional<ImageData> findByName(String filename);
}
