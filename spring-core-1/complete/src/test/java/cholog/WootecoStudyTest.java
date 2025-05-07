package cholog;

import cholog.utils.ContextUtils;
import cholog.wooteco.WootecoContextConfiguration;
import cholog.wooteco.julie.JulieBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

class WootecoStudyTest {

    @Test
    void scanComponent1() {
        ApplicationContext context = ContextUtils.getApplicationContext(WootecoContextConfiguration.class);

        JulieBean julieBean = context.getBean("julieBean", JulieBean.class);
        assertThat(julieBean).isNotNull();
    }

    @Test
    void scanComponent2() {
        ApplicationContext context = ContextUtils.getApplicationContext(WootecoContextConfiguration.class);

        assertThatNoException().isThrownBy(() -> context.getBean("otherBean"));
    }
}
