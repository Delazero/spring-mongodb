package br.com.delazari.springMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}
/*

	Exemplos utilizando o commandLineRunner e querys com mongoTemplate

	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
		return args -> {
			Address address = new Address("Brasil", "15600-000", "Fernandópolis");

			Student student = new Student("Leonardo", "Delazari", "leonardo.delazari.10@gmail.com", Gender.MALE,
					address, List.of("Computer Science", "Maths"), BigDecimal.TEN, LocalDateTime.now());
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(student.getEmail()));

			// usingMongoTemplate(repository, mongoTemplate, student, query);

			repository.findByEmail(student.getEmail()).ifPresentOrElse(s -> {
				System.out.println(s + " already exists");
			}, () -> {
				System.out.println("Inserting student " + student);
				repository.insert(student);
			});
		};
	}

	private void usingMongoTemplate(StudentRepository repository, MongoTemplate mongoTemplate, Student student,
			Query query) {
		List<Student> students = mongoTemplate.find(query, Student.class);

		if (students.size() > 1) {
			throw new IllegalStateException("Found many students with email" + student.getEmail());
		}
		if (students.isEmpty()) {
			System.out.println("Inserting student " + student);
			repository.insert(student);
		} else {
			System.out.println(student + " already exists");
		}
	}
*/
}
