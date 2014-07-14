package command;

import storage.StorageService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lss on 7/14/14.
 */
public class DelCommand implements Command
{
    public DelCommand(StorageService storage)
    {
        this.storage = storage;
    }

    @Override
    public String execute(HttpServletRequest request)
    {
        String id = request.getParameter("id");
        storage.delete(storage.get(Long.parseLong(id)));

        return "list.do";
    }

    private StorageService storage;
}
