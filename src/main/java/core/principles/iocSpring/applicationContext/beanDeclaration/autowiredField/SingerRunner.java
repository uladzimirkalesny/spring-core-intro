package core.principles.iocSpring.applicationContext.beanDeclaration.autowiredField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("singer")
class Singer {
    @Autowired
    private Inspiration inspirationBean;

    public void sing() {
        System.out.println(" ... " + inspirationBean.getLyric());
    }
}

@Component("inspiration")
class Inspiration {
    private String lyric = "I сап keep the door cracked ореn, to let light through";

    public Inspiration(@Value("For all any running, I саn understand") String lyric) {
        this.lyric = lyric;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }
}

public class SingerRunner {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("classpath:principles/iocSpring/autowiredField/autowiredFieldDI.xml");
        Singer singer = context.getBean("singer", Singer.class);
        singer.sing();
    }
}

