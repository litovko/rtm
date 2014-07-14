package command;

import model.Record;
import org.apache.commons.lang3.StringUtils;
import storage.StorageService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lss on 7/14/14.
 */
public class EditCommand implements Command
{
    public EditCommand(StorageService storage)
    {
        this.storage = storage;
    }
    @Override
    public String execute(HttpServletRequest request)
    {
        String id = request.getParameter("id");

        Record record = storage.get(Long.parseLong(id));
        if (StringUtils.equalsIgnoreCase("get", request.getMethod()))
        {
            request.setAttribute("record", record);
            return "/view/edit.jsp";
        }
        record.setNote(request.getParameter("note"));
        return "list.do";
    }

    private StorageService storage;

}
