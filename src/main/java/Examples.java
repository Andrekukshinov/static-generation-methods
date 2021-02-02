
import com.sun.org.apache.xpath.internal.XPath;
import com.sun.org.apache.xpath.internal.operations.And;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.*;

public class Examples {
    public static void main(String[] args) throws IOException {
	   Date from = Date.from( Instant.MAX);
	   Optional<Integer> of = Optional.of(19);
	   BigInteger valueOf = BigInteger.valueOf(Integer.MAX_VALUE);
	   Object newInstance = Array.newInstance(Object.class, 10);
	   FileStore getType = Files.getFileStore((Path) new XPath(new And()));
	   BufferedReader newType = Files.newBufferedReader((Path) new XPath(new And()));
	   List<Integer> type = Collections.list(new Enum());
    }
}








class Enum implements Enumeration<Integer> {

    @Override
    public boolean hasMoreElements() {
	   return false;
    }

    @Override
    public Integer nextElement() {
	   return null;
    }
}
