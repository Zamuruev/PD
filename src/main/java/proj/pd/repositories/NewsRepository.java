package proj.pd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proj.pd.entities.News;

import java.util.UUID;

@Repository
public interface NewsRepository extends JpaRepository<News, UUID> {




}
