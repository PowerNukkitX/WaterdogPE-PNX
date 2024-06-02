/*
 * Copyright 2022 WaterdogTEAM
 * Licensed under the GNU General Public License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.waterdog.waterdogpe.utils.config.proxy;

import lombok.Getter;
import lombok.experimental.Accessors;
import net.cubespace.Yamler.Config.Comment;
import net.cubespace.Yamler.Config.Path;
import net.cubespace.Yamler.Config.YamlConfig;
import org.cloudburstmc.netty.channel.raknet.RakConstants;

@Getter
public class NetworkSettings extends YamlConfig {

    @Path("enable_ipv6")
    @Accessors(fluent = true)
    @Comment("If enabled, the proxy will be able to bind to an Ipv6 Address")
    private boolean enableIpv6 = false;

    @Path("max_user_mtu")
    @Comment("Maximum MTU size of user <-> proxy connection that is allowed")
    private int maximumMtu = RakConstants.MAXIMUM_MTU_SIZE;

    @Path("max_downstream_mtu")
    @Comment("Maximum MTU size of proxy <-> server connection that is allowed")
    private int maximumDownstreamMtu = RakConstants.MAXIMUM_MTU_SIZE;

    @Path("connection_timeout")
    @Comment("Server connection timeout in seconds")
    private int connectTimeout = 15;

    @Comment("Connection throttle time in milliseconds")
    @Path("connection_throttle_time")
    private int connectionThrottleTime = 1000;

    @Comment("Number of connections that can be opened in \"connection_throttle_time\" interval. To disable set value to -1")
    @Path("connection_throttle")
    private int connectionThrottle = 10;

    @Comment("Number of login requests that can be made in \"connection_throttle_time\" interval. To disable set value to -1")
    @Path("login_throttle")
    private int loginThrottle = 2;

    @Path("enable_cookies")
    @Accessors(fluent = true)
    @Comment("Enable RakNet cookies for additional security. Do NOT disable this unless you know what you are doing.")
    private boolean enableCookies = true;

    @Path("max_decompressed_bytes")
    @Accessors(fluent = true)
    @Comment("The maximum number of compressed bytes.")
    private int maxDecompressedBytes = 1024 * 1024 * 100;//100M

    @Path("max_bytearray_size")
    @Accessors(fluent = true)
    @Comment("The maximum bytes of bytearray.")
    private int maxByteArraySize = 1024 * 1024 * 50;

    @Path("max_list_size")
    @Accessors(fluent = true)
    @Comment("The maximum bytes of list.")
    private int maxListSize = 1024 * 1024 * 50;

    @Path("max_network_nbt_size")
    @Accessors(fluent = true)
    @Comment("The maximum bytes of network_nbt.")
    private int maxNetworkNBTSize = 1024 * 1024 * 50;

    @Path("max_item_nbt_size")
    @Accessors(fluent = true)
    @Comment("The maximum bytes of item_nbt.")
    private int maxItemNBTSize = 1024 * 1024 * 50;

    @Path("max_string_size")
    @Accessors(fluent = true)
    @Comment("The maximum bytes of string.")
    private int maxStringLength = 1024 * 1024 * 50;

    @Path("skin_max_byte_size")
    @Accessors(fluent = true)
    @Comment("The maximum bytes of skin.")
    private int maxSkinLength = 1024 * 1024 * 50;

    @Path("packet_limit")
    @Accessors(fluent = true)
    @Comment("The maximum number per section of packet.")
    private int packetLimit = 240;
}
