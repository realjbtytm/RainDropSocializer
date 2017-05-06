package raindropsocializer;

import java.util.Arrays;
import java.util.List;

import PluginReference.ChatColor;
import PluginReference.MC_Command;
import PluginReference.MC_Player;

public class DirectMessagingCMD implements MC_Command {

	@Override
	public List<String> getAliases() {
		return Arrays.asList("dm", "pm", "msg");
	}

	@Override
	public String getCommandName() {
		return "message";
	}

	@Override
	public String getHelpLine(MC_Player arg0) {
		return ChatColor.LIGHT_PURPLE + "/message " + ChatColor.WHITE + "--- Message to player";
	}

	@Override
	public List<String> getTabCompletionList(MC_Player arg0, String[] arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleCommand(MC_Player arg0, String[] arg1) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public boolean hasPermissionToUse(MC_Player plr) {
        return plr.hasPermission("raindrop.directmessaging");
	}

}
