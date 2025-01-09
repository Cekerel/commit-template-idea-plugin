package cn.cekerel.artifact.jetbrains.plugin.git.commit.template;



import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;

public class GitLogQueryTest {

    @Test
    @Disabled("manual testing")
    public void testExecute() {
        GitLogQuery.Result result = new GitLogQuery(new File("<absolute path>")).execute();

        System.out.println(result.isSuccess());
        System.out.println(result.getScopes());
    }

}