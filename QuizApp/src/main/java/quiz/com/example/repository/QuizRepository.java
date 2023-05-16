package quiz.com.example.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quiz.com.example.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    Optional<Quiz> findByStartDateBeforeAndEndDateAfter(LocalDateTime startDate, LocalDateTime endDate);

    List<Quiz> findByEndDateBefore(LocalDateTime endDate);
}
