package net.mefmor.tutorial.spring.boot.testing.database.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class DatabaseJpaTests {

    @Test
    void testSaveCustomersToRepository(@Autowired CustomerRepository customers) {
        Customer inputCustomer = new Customer("Pavel", "Ivanov");

        customers.save(inputCustomer);

        assertThat(customers.findByLastName("Ivanov")).containsOnly(inputCustomer);
    }

}
