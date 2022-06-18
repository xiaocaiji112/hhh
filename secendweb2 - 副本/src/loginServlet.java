import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\86131\\IdeaProjects\\firstweb\\webapp\\login.html");
        int len;
        byte[]bytes = new byte[1024];
        StringBuilder stringBuilder = new StringBuilder();
        while ((len = fileInputStream.read(bytes)) != -1){
            stringBuilder.append(new String(bytes,0,len));
        }
        resp.setCharacterEncoding("gbk");

        PrintWriter writer = resp.getWriter();
        writer.print(stringBuilder.toString());
    }
}
