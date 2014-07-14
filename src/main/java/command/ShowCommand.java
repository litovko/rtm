package command;

import storage.StorageService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lss on 7/14/14.
 */
public class ShowCommand implements Command
{
    public ShowCommand(StorageService storage)
    {
        this.storage = storage;
    }
    @Override
    public String execute(HttpServletRequest request)
    {
        String id = request.getParameter("id");
        request.setAttribute("record", storage.get(Long.parseLong(id)));
        return "/view/show.jsp";
    }

    private StorageService storage;

}
