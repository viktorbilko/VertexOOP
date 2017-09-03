package vertexOOP.lesson4.classswork;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by vertex0002 on 31.08.2017.
 */
public class UrlException {

    public static void main(String[] args) {

        String site = "afaf";

        site.startsWith("https://");

        List<String> listOk = new LinkedList<>();
        listOk.add("facebook.com");

        List<String> listBad = new LinkedList<>();
        listBad.add("vk.com");

        try {
            int y = check(site, listOk, listBad);
            System.out.println(y);
        } catch (NoProtocolException e){
            e.printStackTrace();
        } catch (NoUrlException e){
            e.printStackTrace();
        } catch (NoSiteException e){
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }


    }

    private static int check(String site, List<String> listOk, List<String> listBad) throws NoProtocolException, NoUrlException, NoSiteException {

        if ("".equals(site)) {
            throw new NoUrlException();
        }

        if (!site.startsWith("https://")){
            throw new NoProtocolException();
        }
        for (String s : listOk) {
            if (s.equals(site)) {
                return 200;
            }
        }

        for (String s : listBad) {
            s.equals(site);
            return 400;
        }

        throw new NoSiteException();
    }
}
