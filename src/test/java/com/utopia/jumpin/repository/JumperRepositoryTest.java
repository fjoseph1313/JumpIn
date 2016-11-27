package com.utopia.jumpin.repository;

import com.utopia.jumpin.model.Jumper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by fjoseph1313 on 11/26/2016.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class JumperRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private JumperRepository jumperRepository;

    @Test
    public void testDependency() throws Exception{
        Assert.assertNotNull(jumperRepository);
    }

    @Test
    public void findByJumperNameShouldReturnJumper() {
        this.testEntityManager.persist(new Jumper("sboot", "123"));
        Jumper user = this.jumperRepository.findByJumperName("sboot");

        assertThat(user.getJumperName()).isEqualTo("sboot");
        assertThat(user.getStatus()).isEqualTo("123");
    }

}
