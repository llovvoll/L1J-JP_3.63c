/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package jp.l1j.server.packets.server;

import java.util.logging.Logger;
import jp.l1j.server.codes.Opcodes;

// Referenced classes of package jp.l1j.server.serverpackets:
// ServerBasePacket

public class S_SelectTarget extends ServerBasePacket {

	private static Logger _log = Logger.getLogger(S_SelectTarget.class
			.getName());
	private static final String S_SELECT_TARGET = "[S] S_SelectTarget";
	private byte[] _byte = null;

	public S_SelectTarget(int ObjectId) {
		writeC(Opcodes.S_OPCODE_SELECTTARGET);
		writeD(ObjectId);
		writeC(0x00);
		writeC(0x00);
		writeC(0x02);
	}

	@Override
	public byte[] getContent() {
		if (_byte == null) {
			_byte = getBytes();
		}
		return _byte;
	}

	@Override
	public String getType() {
		return S_SELECT_TARGET;
	}
}
