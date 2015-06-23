/*
 * Copyright 2014 Hieu Rocker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rockerhieu.emojicon;

import android.content.Context;
import android.text.Spannable;
import android.util.SparseIntArray;

/**
 * @author Hieu Rocker (rockerhieu@gmail.com)
 */
public final class EmojiconHandler {
    private EmojiconHandler() {
    }

    private static final SparseIntArray sEmojisMap = new SparseIntArray(846);
    private static final SparseIntArray sSoftbanksMap = new SparseIntArray(471);

    static {
    	/*
        sSoftbanksMap.put(0xe001, R.drawable.emoji_1f466);
        sSoftbanksMap.put(0xe002, R.drawable.emoji_1f467);
        sSoftbanksMap.put(0xe003, R.drawable.emoji_1f48b);
        sSoftbanksMap.put(0xe004, R.drawable.emoji_1f468);
        sSoftbanksMap.put(0xe005, R.drawable.emoji_1f469);
        sSoftbanksMap.put(0xe006, R.drawable.emoji_1f455);
        sSoftbanksMap.put(0xe007, R.drawable.emoji_1f45e);
        sSoftbanksMap.put(0xe008, R.drawable.emoji_1f4f7);
        sSoftbanksMap.put(0xe009, R.drawable.emoji_1f4de);
        sSoftbanksMap.put(0xe00a, R.drawable.emoji_1f4f1);
        sSoftbanksMap.put(0xe00b, R.drawable.emoji_1f4e0);
        sSoftbanksMap.put(0xe00c, R.drawable.emoji_1f4bb);
        sSoftbanksMap.put(0xe00d, R.drawable.emoji_1f44a);
        sSoftbanksMap.put(0xe00e, R.drawable.emoji_1f44d);
        sSoftbanksMap.put(0xe00f, R.drawable.emoji_261d);
        sSoftbanksMap.put(0xe010, R.drawable.emoji_270a);
        sSoftbanksMap.put(0xe011, R.drawable.emoji_270c);
        sSoftbanksMap.put(0xe012, R.drawable.emoji_1f64b);
        sSoftbanksMap.put(0xe013, R.drawable.emoji_1f3bf);
        sSoftbanksMap.put(0xe014, R.drawable.emoji_26f3);
        sSoftbanksMap.put(0xe015, R.drawable.emoji_1f3be);
        sSoftbanksMap.put(0xe016, R.drawable.emoji_26be);
        sSoftbanksMap.put(0xe017, R.drawable.emoji_1f3c4);
        sSoftbanksMap.put(0xe018, R.drawable.emoji_26bd);
        sSoftbanksMap.put(0xe019, R.drawable.emoji_1f3a3);
        sSoftbanksMap.put(0xe01a, R.drawable.emoji_1f434);
        sSoftbanksMap.put(0xe01b, R.drawable.emoji_1f697);
        sSoftbanksMap.put(0xe01c, R.drawable.emoji_26f5);
        sSoftbanksMap.put(0xe01d, R.drawable.emoji_2708);
        sSoftbanksMap.put(0xe01e, R.drawable.emoji_1f683);
        sSoftbanksMap.put(0xe01f, R.drawable.emoji_1f685);
        sSoftbanksMap.put(0xe020, R.drawable.emoji_2753);
        sSoftbanksMap.put(0xe021, R.drawable.emoji_2757);
        sSoftbanksMap.put(0xe022, R.drawable.emoji_2764);
        sSoftbanksMap.put(0xe023, R.drawable.emoji_1f494);
        sSoftbanksMap.put(0xe024, R.drawable.emoji_1f550);
        sSoftbanksMap.put(0xe025, R.drawable.emoji_1f551);
        sSoftbanksMap.put(0xe026, R.drawable.emoji_1f552);
        sSoftbanksMap.put(0xe027, R.drawable.emoji_1f553);
        sSoftbanksMap.put(0xe028, R.drawable.emoji_1f554);
        sSoftbanksMap.put(0xe029, R.drawable.emoji_1f555);
        sSoftbanksMap.put(0xe02a, R.drawable.emoji_1f556);
        sSoftbanksMap.put(0xe02b, R.drawable.emoji_1f557);
        sSoftbanksMap.put(0xe02c, R.drawable.emoji_1f558);
        sSoftbanksMap.put(0xe02d, R.drawable.emoji_1f559);
        sSoftbanksMap.put(0xe02e, R.drawable.emoji_1f55a);
        sSoftbanksMap.put(0xe02f, R.drawable.emoji_1f55b);
        sSoftbanksMap.put(0xe030, R.drawable.emoji_1f338);
        sSoftbanksMap.put(0xe031, R.drawable.emoji_1f531);
        sSoftbanksMap.put(0xe032, R.drawable.emoji_1f339);
        sSoftbanksMap.put(0xe033, R.drawable.emoji_1f384);
        sSoftbanksMap.put(0xe034, R.drawable.emoji_1f48d);
        sSoftbanksMap.put(0xe035, R.drawable.emoji_1f48e);
        sSoftbanksMap.put(0xe036, R.drawable.emoji_1f3e0);
        sSoftbanksMap.put(0xe037, R.drawable.emoji_26ea);
        sSoftbanksMap.put(0xe038, R.drawable.emoji_1f3e2);
        sSoftbanksMap.put(0xe039, R.drawable.emoji_1f689);
        sSoftbanksMap.put(0xe03a, R.drawable.emoji_26fd);
        sSoftbanksMap.put(0xe03b, R.drawable.emoji_1f5fb);
        sSoftbanksMap.put(0xe03c, R.drawable.emoji_1f3a4);
        sSoftbanksMap.put(0xe03d, R.drawable.emoji_1f3a5);
        sSoftbanksMap.put(0xe03e, R.drawable.emoji_1f3b5);
        sSoftbanksMap.put(0xe03f, R.drawable.emoji_1f511);
        sSoftbanksMap.put(0xe040, R.drawable.emoji_1f3b7);
        sSoftbanksMap.put(0xe041, R.drawable.emoji_1f3b8);
        sSoftbanksMap.put(0xe042, R.drawable.emoji_1f3ba);
        sSoftbanksMap.put(0xe043, R.drawable.emoji_1f374);
        sSoftbanksMap.put(0xe044, R.drawable.emoji_1f377);
        sSoftbanksMap.put(0xe045, R.drawable.emoji_2615);
        sSoftbanksMap.put(0xe046, R.drawable.emoji_1f370);
        sSoftbanksMap.put(0xe047, R.drawable.emoji_1f37a);
        sSoftbanksMap.put(0xe048, R.drawable.emoji_26c4);
        sSoftbanksMap.put(0xe049, R.drawable.emoji_2601);
        sSoftbanksMap.put(0xe04a, R.drawable.emoji_2600);
        sSoftbanksMap.put(0xe04b, R.drawable.emoji_2614);
        sSoftbanksMap.put(0xe04c, R.drawable.emoji_1f313);
        sSoftbanksMap.put(0xe04d, R.drawable.emoji_1f304);
        sSoftbanksMap.put(0xe04e, R.drawable.emoji_1f47c);
        sSoftbanksMap.put(0xe04f, R.drawable.emoji_1f431);
        sSoftbanksMap.put(0xe050, R.drawable.emoji_1f42f);
        sSoftbanksMap.put(0xe051, R.drawable.emoji_1f43b);
        sSoftbanksMap.put(0xe052, R.drawable.emoji_1f429);
        sSoftbanksMap.put(0xe053, R.drawable.emoji_1f42d);
        sSoftbanksMap.put(0xe054, R.drawable.emoji_1f433);
        sSoftbanksMap.put(0xe055, R.drawable.emoji_1f427);
        sSoftbanksMap.put(0xe056, R.drawable.emoji_1f60a);
        sSoftbanksMap.put(0xe057, R.drawable.emoji_1f603);
        sSoftbanksMap.put(0xe058, R.drawable.emoji_1f61e);
        sSoftbanksMap.put(0xe059, R.drawable.emoji_1f620);
        sSoftbanksMap.put(0xe05a, R.drawable.emoji_1f4a9);
        sSoftbanksMap.put(0xe101, R.drawable.emoji_1f4ea);
        sSoftbanksMap.put(0xe102, R.drawable.emoji_1f4ee);
        sSoftbanksMap.put(0xe103, R.drawable.emoji_1f4e7);
        sSoftbanksMap.put(0xe104, R.drawable.emoji_1f4f2);
        sSoftbanksMap.put(0xe105, R.drawable.emoji_1f61c);
        sSoftbanksMap.put(0xe106, R.drawable.emoji_1f60d);
        sSoftbanksMap.put(0xe107, R.drawable.emoji_1f631);
        sSoftbanksMap.put(0xe108, R.drawable.emoji_1f613);
        sSoftbanksMap.put(0xe109, R.drawable.emoji_1f435);
        sSoftbanksMap.put(0xe10a, R.drawable.emoji_1f419);
        sSoftbanksMap.put(0xe10b, R.drawable.emoji_1f437);
        sSoftbanksMap.put(0xe10c, R.drawable.emoji_1f47d);
        sSoftbanksMap.put(0xe10d, R.drawable.emoji_1f680);
        sSoftbanksMap.put(0xe10e, R.drawable.emoji_1f451);
        sSoftbanksMap.put(0xe10f, R.drawable.emoji_1f4a1);
        sSoftbanksMap.put(0xe110, R.drawable.emoji_1f331);
        sSoftbanksMap.put(0xe111, R.drawable.emoji_1f48f);
        sSoftbanksMap.put(0xe112, R.drawable.emoji_1f381);
        sSoftbanksMap.put(0xe113, R.drawable.emoji_1f52b);
        sSoftbanksMap.put(0xe114, R.drawable.emoji_1f50d);
        sSoftbanksMap.put(0xe115, R.drawable.emoji_1f3c3);
        sSoftbanksMap.put(0xe116, R.drawable.emoji_1f528);
        sSoftbanksMap.put(0xe117, R.drawable.emoji_1f386);
        sSoftbanksMap.put(0xe118, R.drawable.emoji_1f341);
        sSoftbanksMap.put(0xe119, R.drawable.emoji_1f342);
        sSoftbanksMap.put(0xe11a, R.drawable.emoji_1f47f);
        sSoftbanksMap.put(0xe11b, R.drawable.emoji_1f47b);
        sSoftbanksMap.put(0xe11c, R.drawable.emoji_1f480);
        sSoftbanksMap.put(0xe11d, R.drawable.emoji_1f525);
        sSoftbanksMap.put(0xe11e, R.drawable.emoji_1f4bc);
        sSoftbanksMap.put(0xe11f, R.drawable.emoji_1f4ba);
        sSoftbanksMap.put(0xe120, R.drawable.emoji_1f354);
        sSoftbanksMap.put(0xe121, R.drawable.emoji_26f2);
        sSoftbanksMap.put(0xe122, R.drawable.emoji_26fa);
        sSoftbanksMap.put(0xe123, R.drawable.emoji_2668);
        sSoftbanksMap.put(0xe124, R.drawable.emoji_1f3a1);
        sSoftbanksMap.put(0xe125, R.drawable.emoji_1f3ab);
        sSoftbanksMap.put(0xe126, R.drawable.emoji_1f4bf);
        sSoftbanksMap.put(0xe127, R.drawable.emoji_1f4c0);
        sSoftbanksMap.put(0xe128, R.drawable.emoji_1f4fb);
        sSoftbanksMap.put(0xe129, R.drawable.emoji_1f4fc);
        sSoftbanksMap.put(0xe12a, R.drawable.emoji_1f4fa);
        sSoftbanksMap.put(0xe12b, R.drawable.emoji_1f47e);
        sSoftbanksMap.put(0xe12c, R.drawable.emoji_303d);
        sSoftbanksMap.put(0xe12d, R.drawable.emoji_1f004);
        sSoftbanksMap.put(0xe12e, R.drawable.emoji_1f19a);
        sSoftbanksMap.put(0xe12f, R.drawable.emoji_1f4b0);
        sSoftbanksMap.put(0xe130, R.drawable.emoji_1f3af);
        sSoftbanksMap.put(0xe131, R.drawable.emoji_1f3c6);
        sSoftbanksMap.put(0xe132, R.drawable.emoji_1f3c1);
        sSoftbanksMap.put(0xe133, R.drawable.emoji_1f3b0);
        sSoftbanksMap.put(0xe134, R.drawable.emoji_1f40e);
        sSoftbanksMap.put(0xe135, R.drawable.emoji_1f6a4);
        sSoftbanksMap.put(0xe136, R.drawable.emoji_1f6b2);
        sSoftbanksMap.put(0xe137, R.drawable.emoji_1f6a7);
        sSoftbanksMap.put(0xe138, R.drawable.emoji_1f6b9);
        sSoftbanksMap.put(0xe139, R.drawable.emoji_1f6ba);
        sSoftbanksMap.put(0xe13a, R.drawable.emoji_1f6bc);
        sSoftbanksMap.put(0xe13b, R.drawable.emoji_1f489);
        sSoftbanksMap.put(0xe13c, R.drawable.emoji_1f4a4);
        sSoftbanksMap.put(0xe13d, R.drawable.emoji_26a1);
        sSoftbanksMap.put(0xe13e, R.drawable.emoji_1f460);
        sSoftbanksMap.put(0xe13f, R.drawable.emoji_1f6c0);
        sSoftbanksMap.put(0xe140, R.drawable.emoji_1f6bd);
        sSoftbanksMap.put(0xe141, R.drawable.emoji_1f50a);
        sSoftbanksMap.put(0xe142, R.drawable.emoji_1f4e2);
        sSoftbanksMap.put(0xe143, R.drawable.emoji_1f38c);
        sSoftbanksMap.put(0xe144, R.drawable.emoji_1f50f);
        sSoftbanksMap.put(0xe145, R.drawable.emoji_1f513);
        sSoftbanksMap.put(0xe146, R.drawable.emoji_1f306);
        sSoftbanksMap.put(0xe147, R.drawable.emoji_1f373);
        sSoftbanksMap.put(0xe148, R.drawable.emoji_1f4c7);
        sSoftbanksMap.put(0xe149, R.drawable.emoji_1f4b1);
        sSoftbanksMap.put(0xe14a, R.drawable.emoji_1f4b9);
        sSoftbanksMap.put(0xe14b, R.drawable.emoji_1f4e1);
        sSoftbanksMap.put(0xe14c, R.drawable.emoji_1f4aa);
        sSoftbanksMap.put(0xe14d, R.drawable.emoji_1f3e6);
        sSoftbanksMap.put(0xe14e, R.drawable.emoji_1f6a5);
        sSoftbanksMap.put(0xe14f, R.drawable.emoji_1f17f);
        sSoftbanksMap.put(0xe150, R.drawable.emoji_1f68f);
        sSoftbanksMap.put(0xe151, R.drawable.emoji_1f6bb);
        sSoftbanksMap.put(0xe152, R.drawable.emoji_1f46e);
        sSoftbanksMap.put(0xe153, R.drawable.emoji_1f3e3);
        sSoftbanksMap.put(0xe154, R.drawable.emoji_1f3e7);
        sSoftbanksMap.put(0xe155, R.drawable.emoji_1f3e5);
        sSoftbanksMap.put(0xe156, R.drawable.emoji_1f3ea);
        sSoftbanksMap.put(0xe157, R.drawable.emoji_1f3eb);
        sSoftbanksMap.put(0xe158, R.drawable.emoji_1f3e8);
        sSoftbanksMap.put(0xe159, R.drawable.emoji_1f68c);
        sSoftbanksMap.put(0xe15a, R.drawable.emoji_1f695);
        sSoftbanksMap.put(0xe201, R.drawable.emoji_1f6b6);
        sSoftbanksMap.put(0xe202, R.drawable.emoji_1f6a2);
        sSoftbanksMap.put(0xe203, R.drawable.emoji_1f201);
        sSoftbanksMap.put(0xe204, R.drawable.emoji_1f49f);
        sSoftbanksMap.put(0xe205, R.drawable.emoji_2734);
        sSoftbanksMap.put(0xe206, R.drawable.emoji_2733);
        sSoftbanksMap.put(0xe207, R.drawable.emoji_1f51e);
        sSoftbanksMap.put(0xe208, R.drawable.emoji_1f6ad);
        sSoftbanksMap.put(0xe209, R.drawable.emoji_1f530);
        sSoftbanksMap.put(0xe20a, R.drawable.emoji_267f);
        sSoftbanksMap.put(0xe20b, R.drawable.emoji_1f4f6);
        sSoftbanksMap.put(0xe20c, R.drawable.emoji_2665);
        sSoftbanksMap.put(0xe20d, R.drawable.emoji_2666);
        sSoftbanksMap.put(0xe20e, R.drawable.emoji_2660);
        sSoftbanksMap.put(0xe20f, R.drawable.emoji_2663);
        sSoftbanksMap.put(0xe210, R.drawable.emoji_0023);
        sSoftbanksMap.put(0xe211, R.drawable.emoji_27bf);
        sSoftbanksMap.put(0xe212, R.drawable.emoji_1f195);
        sSoftbanksMap.put(0xe213, R.drawable.emoji_1f199);
        sSoftbanksMap.put(0xe214, R.drawable.emoji_1f192);
        sSoftbanksMap.put(0xe215, R.drawable.emoji_1f236);
        sSoftbanksMap.put(0xe216, R.drawable.emoji_1f21a);
        sSoftbanksMap.put(0xe217, R.drawable.emoji_1f237);
        sSoftbanksMap.put(0xe218, R.drawable.emoji_1f238);
        sSoftbanksMap.put(0xe219, R.drawable.emoji_1f534);
        sSoftbanksMap.put(0xe21a, R.drawable.emoji_1f532);
        sSoftbanksMap.put(0xe21b, R.drawable.emoji_1f533);
        sSoftbanksMap.put(0xe21c, R.drawable.emoji_0031);
        sSoftbanksMap.put(0xe21d, R.drawable.emoji_0032);
        sSoftbanksMap.put(0xe21e, R.drawable.emoji_0033);
        sSoftbanksMap.put(0xe21f, R.drawable.emoji_0034);
        sSoftbanksMap.put(0xe220, R.drawable.emoji_0035);
        sSoftbanksMap.put(0xe221, R.drawable.emoji_0036);
        sSoftbanksMap.put(0xe222, R.drawable.emoji_0037);
        sSoftbanksMap.put(0xe223, R.drawable.emoji_0038);
        sSoftbanksMap.put(0xe224, R.drawable.emoji_0039);
        sSoftbanksMap.put(0xe225, R.drawable.emoji_0030);
        sSoftbanksMap.put(0xe226, R.drawable.emoji_1f250);
        sSoftbanksMap.put(0xe227, R.drawable.emoji_1f239);
        sSoftbanksMap.put(0xe228, R.drawable.emoji_1f202);
        sSoftbanksMap.put(0xe229, R.drawable.emoji_1f194);
        sSoftbanksMap.put(0xe22a, R.drawable.emoji_1f235);
        sSoftbanksMap.put(0xe22b, R.drawable.emoji_1f233);
        sSoftbanksMap.put(0xe22c, R.drawable.emoji_1f22f);
        sSoftbanksMap.put(0xe22d, R.drawable.emoji_1f23a);
        sSoftbanksMap.put(0xe22e, R.drawable.emoji_1f446);
        sSoftbanksMap.put(0xe22f, R.drawable.emoji_1f447);
        sSoftbanksMap.put(0xe230, R.drawable.emoji_1f448);
        sSoftbanksMap.put(0xe231, R.drawable.emoji_1f449);
        sSoftbanksMap.put(0xe232, R.drawable.emoji_2b06);
        sSoftbanksMap.put(0xe233, R.drawable.emoji_2b07);
        sSoftbanksMap.put(0xe234, R.drawable.emoji_27a1);
        sSoftbanksMap.put(0xe235, R.drawable.emoji_1f519);
        sSoftbanksMap.put(0xe236, R.drawable.emoji_2197);
        sSoftbanksMap.put(0xe237, R.drawable.emoji_2196);
        sSoftbanksMap.put(0xe238, R.drawable.emoji_2198);
        sSoftbanksMap.put(0xe239, R.drawable.emoji_2199);
        sSoftbanksMap.put(0xe23a, R.drawable.emoji_25b6);
        sSoftbanksMap.put(0xe23b, R.drawable.emoji_25c0);
        sSoftbanksMap.put(0xe23c, R.drawable.emoji_23e9);
        sSoftbanksMap.put(0xe23d, R.drawable.emoji_23ea);
        sSoftbanksMap.put(0xe23e, R.drawable.emoji_1f52e);
        sSoftbanksMap.put(0xe23f, R.drawable.emoji_2648);
        sSoftbanksMap.put(0xe240, R.drawable.emoji_2649);
        sSoftbanksMap.put(0xe241, R.drawable.emoji_264a);
        sSoftbanksMap.put(0xe242, R.drawable.emoji_264b);
        sSoftbanksMap.put(0xe243, R.drawable.emoji_264c);
        sSoftbanksMap.put(0xe244, R.drawable.emoji_264d);
        sSoftbanksMap.put(0xe245, R.drawable.emoji_264e);
        sSoftbanksMap.put(0xe246, R.drawable.emoji_264f);
        sSoftbanksMap.put(0xe247, R.drawable.emoji_2650);
        sSoftbanksMap.put(0xe248, R.drawable.emoji_2651);
        sSoftbanksMap.put(0xe249, R.drawable.emoji_2652);
        sSoftbanksMap.put(0xe24a, R.drawable.emoji_2653);
        sSoftbanksMap.put(0xe24b, R.drawable.emoji_26ce);
        sSoftbanksMap.put(0xe24c, R.drawable.emoji_1f51d);
        sSoftbanksMap.put(0xe24d, R.drawable.emoji_1f197);
        sSoftbanksMap.put(0xe24e, R.drawable.emoji_00a9);
        sSoftbanksMap.put(0xe24f, R.drawable.emoji_00ae);
        sSoftbanksMap.put(0xe250, R.drawable.emoji_1f4f3);
        sSoftbanksMap.put(0xe251, R.drawable.emoji_1f4f4);
        sSoftbanksMap.put(0xe252, R.drawable.emoji_26a0);
        sSoftbanksMap.put(0xe253, R.drawable.emoji_1f481);
        sSoftbanksMap.put(0xe301, R.drawable.emoji_1f4c3);
        sSoftbanksMap.put(0xe302, R.drawable.emoji_1f454);
        sSoftbanksMap.put(0xe303, R.drawable.emoji_1f33a);
        sSoftbanksMap.put(0xe304, R.drawable.emoji_1f337);
        sSoftbanksMap.put(0xe305, R.drawable.emoji_1f33b);
        sSoftbanksMap.put(0xe306, R.drawable.emoji_1f490);
        sSoftbanksMap.put(0xe307, R.drawable.emoji_1f334);
        sSoftbanksMap.put(0xe308, R.drawable.emoji_1f335);
        sSoftbanksMap.put(0xe309, R.drawable.emoji_1f6be);
        sSoftbanksMap.put(0xe30a, R.drawable.emoji_1f3a7);
        sSoftbanksMap.put(0xe30b, R.drawable.emoji_1f376);
        sSoftbanksMap.put(0xe30c, R.drawable.emoji_1f37b);
        sSoftbanksMap.put(0xe30d, R.drawable.emoji_3297);
        sSoftbanksMap.put(0xe30e, R.drawable.emoji_1f6ac);
        sSoftbanksMap.put(0xe30f, R.drawable.emoji_1f48a);
        sSoftbanksMap.put(0xe310, R.drawable.emoji_1f388);
        sSoftbanksMap.put(0xe311, R.drawable.emoji_1f4a3);
        sSoftbanksMap.put(0xe312, R.drawable.emoji_1f389);
        sSoftbanksMap.put(0xe313, R.drawable.emoji_2702);
        sSoftbanksMap.put(0xe314, R.drawable.emoji_1f380);
        sSoftbanksMap.put(0xe315, R.drawable.emoji_3299);
        sSoftbanksMap.put(0xe316, R.drawable.emoji_1f4bd);
        sSoftbanksMap.put(0xe317, R.drawable.emoji_1f4e3);
        sSoftbanksMap.put(0xe318, R.drawable.emoji_1f452);
        sSoftbanksMap.put(0xe319, R.drawable.emoji_1f457);
        sSoftbanksMap.put(0xe31a, R.drawable.emoji_1f461);
        sSoftbanksMap.put(0xe31b, R.drawable.emoji_1f462);
        sSoftbanksMap.put(0xe31c, R.drawable.emoji_1f484);
        sSoftbanksMap.put(0xe31d, R.drawable.emoji_1f485);
        sSoftbanksMap.put(0xe31e, R.drawable.emoji_1f486);
        sSoftbanksMap.put(0xe31f, R.drawable.emoji_1f487);
        sSoftbanksMap.put(0xe320, R.drawable.emoji_1f488);
        sSoftbanksMap.put(0xe321, R.drawable.emoji_1f458);
        sSoftbanksMap.put(0xe322, R.drawable.emoji_1f459);
        sSoftbanksMap.put(0xe323, R.drawable.emoji_1f45c);
        sSoftbanksMap.put(0xe324, R.drawable.emoji_1f3ac);
        sSoftbanksMap.put(0xe325, R.drawable.emoji_1f514);
        sSoftbanksMap.put(0xe326, R.drawable.emoji_1f3b6);
        sSoftbanksMap.put(0xe327, R.drawable.emoji_1f493);
        sSoftbanksMap.put(0xe328, R.drawable.emoji_1f48c);
        sSoftbanksMap.put(0xe329, R.drawable.emoji_1f498);
        sSoftbanksMap.put(0xe32a, R.drawable.emoji_1f499);
        sSoftbanksMap.put(0xe32b, R.drawable.emoji_1f49a);
        sSoftbanksMap.put(0xe32c, R.drawable.emoji_1f49b);
        sSoftbanksMap.put(0xe32d, R.drawable.emoji_1f49c);
        sSoftbanksMap.put(0xe32e, R.drawable.emoji_2728);
        sSoftbanksMap.put(0xe32f, R.drawable.emoji_2b50);
        sSoftbanksMap.put(0xe330, R.drawable.emoji_1f4a8);
        sSoftbanksMap.put(0xe331, R.drawable.emoji_1f4a6);
        sSoftbanksMap.put(0xe332, R.drawable.emoji_2b55);
        sSoftbanksMap.put(0xe333, R.drawable.emoji_2716);
        sSoftbanksMap.put(0xe334, R.drawable.emoji_1f4a2);
        sSoftbanksMap.put(0xe335, R.drawable.emoji_1f31f);
        sSoftbanksMap.put(0xe336, R.drawable.emoji_2754);
        sSoftbanksMap.put(0xe337, R.drawable.emoji_2755);
        sSoftbanksMap.put(0xe338, R.drawable.emoji_1f375);
        sSoftbanksMap.put(0xe339, R.drawable.emoji_1f35e);
        sSoftbanksMap.put(0xe33a, R.drawable.emoji_1f366);
        sSoftbanksMap.put(0xe33b, R.drawable.emoji_1f35f);
        sSoftbanksMap.put(0xe33c, R.drawable.emoji_1f361);
        sSoftbanksMap.put(0xe33d, R.drawable.emoji_1f358);
        sSoftbanksMap.put(0xe33e, R.drawable.emoji_1f35a);
        sSoftbanksMap.put(0xe33f, R.drawable.emoji_1f35d);
        sSoftbanksMap.put(0xe340, R.drawable.emoji_1f35c);
        sSoftbanksMap.put(0xe341, R.drawable.emoji_1f35b);
        sSoftbanksMap.put(0xe342, R.drawable.emoji_1f359);
        sSoftbanksMap.put(0xe343, R.drawable.emoji_1f362);
        sSoftbanksMap.put(0xe344, R.drawable.emoji_1f363);
        sSoftbanksMap.put(0xe345, R.drawable.emoji_1f34e);
        sSoftbanksMap.put(0xe346, R.drawable.emoji_1f34a);
        sSoftbanksMap.put(0xe347, R.drawable.emoji_1f353);
        sSoftbanksMap.put(0xe348, R.drawable.emoji_1f349);
        sSoftbanksMap.put(0xe349, R.drawable.emoji_1f345);
        sSoftbanksMap.put(0xe34a, R.drawable.emoji_1f346);
        sSoftbanksMap.put(0xe34b, R.drawable.emoji_1f382);
        sSoftbanksMap.put(0xe34c, R.drawable.emoji_1f371);
        sSoftbanksMap.put(0xe34d, R.drawable.emoji_1f372);
        sSoftbanksMap.put(0xe401, R.drawable.emoji_1f625);
        sSoftbanksMap.put(0xe402, R.drawable.emoji_1f60f);
        sSoftbanksMap.put(0xe403, R.drawable.emoji_1f614);
        sSoftbanksMap.put(0xe404, R.drawable.emoji_1f601);
        sSoftbanksMap.put(0xe405, R.drawable.emoji_1f609);
        sSoftbanksMap.put(0xe406, R.drawable.emoji_1f623);
        sSoftbanksMap.put(0xe407, R.drawable.emoji_1f616);
        sSoftbanksMap.put(0xe408, R.drawable.emoji_1f62a);
        sSoftbanksMap.put(0xe409, R.drawable.emoji_1f445);
        sSoftbanksMap.put(0xe40a, R.drawable.emoji_1f606);
        sSoftbanksMap.put(0xe40b, R.drawable.emoji_1f628);
        sSoftbanksMap.put(0xe40c, R.drawable.emoji_1f637);
        sSoftbanksMap.put(0xe40d, R.drawable.emoji_1f633);
        sSoftbanksMap.put(0xe40e, R.drawable.emoji_1f612);
        sSoftbanksMap.put(0xe40f, R.drawable.emoji_1f630);
        sSoftbanksMap.put(0xe410, R.drawable.emoji_1f632);
        sSoftbanksMap.put(0xe411, R.drawable.emoji_1f62d);
        sSoftbanksMap.put(0xe412, R.drawable.emoji_1f602);
        sSoftbanksMap.put(0xe413, R.drawable.emoji_1f622);
        sSoftbanksMap.put(0xe414, R.drawable.emoji_263a);
        sSoftbanksMap.put(0xe415, R.drawable.emoji_1f605);
        sSoftbanksMap.put(0xe416, R.drawable.emoji_1f621);
        sSoftbanksMap.put(0xe417, R.drawable.emoji_1f61a);
        sSoftbanksMap.put(0xe418, R.drawable.emoji_1f618);
        sSoftbanksMap.put(0xe419, R.drawable.emoji_1f440);
        sSoftbanksMap.put(0xe41a, R.drawable.emoji_1f443);
        sSoftbanksMap.put(0xe41b, R.drawable.emoji_1f442);
        sSoftbanksMap.put(0xe41c, R.drawable.emoji_1f444);
        sSoftbanksMap.put(0xe41d, R.drawable.emoji_1f64f);
        sSoftbanksMap.put(0xe41e, R.drawable.emoji_1f44b);
        sSoftbanksMap.put(0xe41f, R.drawable.emoji_1f44f);
        sSoftbanksMap.put(0xe420, R.drawable.emoji_1f44c);
        sSoftbanksMap.put(0xe421, R.drawable.emoji_1f44e);
        sSoftbanksMap.put(0xe422, R.drawable.emoji_1f450);
        sSoftbanksMap.put(0xe423, R.drawable.emoji_1f645);
        sSoftbanksMap.put(0xe424, R.drawable.emoji_1f646);
        sSoftbanksMap.put(0xe425, R.drawable.emoji_1f491);
        sSoftbanksMap.put(0xe426, R.drawable.emoji_1f647);
        sSoftbanksMap.put(0xe427, R.drawable.emoji_1f64c);
        sSoftbanksMap.put(0xe428, R.drawable.emoji_1f46b);
        sSoftbanksMap.put(0xe429, R.drawable.emoji_1f46f);
        sSoftbanksMap.put(0xe42a, R.drawable.emoji_1f3c0);
        sSoftbanksMap.put(0xe42b, R.drawable.emoji_1f3c8);
        sSoftbanksMap.put(0xe42c, R.drawable.emoji_1f3b1);
        sSoftbanksMap.put(0xe42d, R.drawable.emoji_1f3ca);
        sSoftbanksMap.put(0xe42e, R.drawable.emoji_1f699);
        sSoftbanksMap.put(0xe42f, R.drawable.emoji_1f69a);
        sSoftbanksMap.put(0xe430, R.drawable.emoji_1f692);
        sSoftbanksMap.put(0xe431, R.drawable.emoji_1f691);
        sSoftbanksMap.put(0xe432, R.drawable.emoji_1f693);
        sSoftbanksMap.put(0xe433, R.drawable.emoji_1f3a2);
        sSoftbanksMap.put(0xe434, R.drawable.emoji_1f687);
        sSoftbanksMap.put(0xe435, R.drawable.emoji_1f684);
        sSoftbanksMap.put(0xe436, R.drawable.emoji_1f38d);
        sSoftbanksMap.put(0xe437, R.drawable.emoji_1f49d);
        sSoftbanksMap.put(0xe438, R.drawable.emoji_1f38e);
        sSoftbanksMap.put(0xe439, R.drawable.emoji_1f393);
        sSoftbanksMap.put(0xe43a, R.drawable.emoji_1f392);
        sSoftbanksMap.put(0xe43b, R.drawable.emoji_1f38f);
        sSoftbanksMap.put(0xe43c, R.drawable.emoji_1f302);
        sSoftbanksMap.put(0xe43d, R.drawable.emoji_1f492);
        sSoftbanksMap.put(0xe43e, R.drawable.emoji_1f30a);
        sSoftbanksMap.put(0xe43f, R.drawable.emoji_1f367);
        sSoftbanksMap.put(0xe440, R.drawable.emoji_1f387);
        sSoftbanksMap.put(0xe441, R.drawable.emoji_1f41a);
        sSoftbanksMap.put(0xe442, R.drawable.emoji_1f390);
        sSoftbanksMap.put(0xe443, R.drawable.emoji_1f300);
        sSoftbanksMap.put(0xe444, R.drawable.emoji_1f33e);
        sSoftbanksMap.put(0xe445, R.drawable.emoji_1f383);
        sSoftbanksMap.put(0xe446, R.drawable.emoji_1f391);
        sSoftbanksMap.put(0xe447, R.drawable.emoji_1f343);
        sSoftbanksMap.put(0xe448, R.drawable.emoji_1f385);
        sSoftbanksMap.put(0xe449, R.drawable.emoji_1f305);
        sSoftbanksMap.put(0xe44a, R.drawable.emoji_1f307);
        sSoftbanksMap.put(0xe44b, R.drawable.emoji_1f303);
        sSoftbanksMap.put(0xe44b, R.drawable.emoji_1f30c);
        sSoftbanksMap.put(0xe44c, R.drawable.emoji_1f308);
        sSoftbanksMap.put(0xe501, R.drawable.emoji_1f3e9);
        sSoftbanksMap.put(0xe502, R.drawable.emoji_1f3a8);
        sSoftbanksMap.put(0xe503, R.drawable.emoji_1f3a9);
        sSoftbanksMap.put(0xe504, R.drawable.emoji_1f3ec);
        sSoftbanksMap.put(0xe505, R.drawable.emoji_1f3ef);
        sSoftbanksMap.put(0xe506, R.drawable.emoji_1f3f0);
        sSoftbanksMap.put(0xe507, R.drawable.emoji_1f3a6);
        sSoftbanksMap.put(0xe508, R.drawable.emoji_1f3ed);
        sSoftbanksMap.put(0xe509, R.drawable.emoji_1f5fc);
        sSoftbanksMap.put(0xe50b, R.drawable.emoji_1f1ef_1f1f5);
        sSoftbanksMap.put(0xe50c, R.drawable.emoji_1f1fa_1f1f8);
        sSoftbanksMap.put(0xe50d, R.drawable.emoji_1f1eb_1f1f7);
        sSoftbanksMap.put(0xe50e, R.drawable.emoji_1f1e9_1f1ea);
        sSoftbanksMap.put(0xe50f, R.drawable.emoji_1f1ee_1f1f9);
        sSoftbanksMap.put(0xe510, R.drawable.emoji_1f1ec_1f1e7);
        sSoftbanksMap.put(0xe511, R.drawable.emoji_1f1ea_1f1f8);
        sSoftbanksMap.put(0xe512, R.drawable.emoji_1f1f7_1f1fa);
        sSoftbanksMap.put(0xe513, R.drawable.emoji_1f1e8_1f1f3);
        sSoftbanksMap.put(0xe514, R.drawable.emoji_1f1f0_1f1f7);
        sSoftbanksMap.put(0xe515, R.drawable.emoji_1f471);
        sSoftbanksMap.put(0xe516, R.drawable.emoji_1f472);
        sSoftbanksMap.put(0xe517, R.drawable.emoji_1f473);
        sSoftbanksMap.put(0xe518, R.drawable.emoji_1f474);
        sSoftbanksMap.put(0xe519, R.drawable.emoji_1f475);
        sSoftbanksMap.put(0xe51a, R.drawable.emoji_1f476);
        sSoftbanksMap.put(0xe51b, R.drawable.emoji_1f477);
        sSoftbanksMap.put(0xe51c, R.drawable.emoji_1f478);
        sSoftbanksMap.put(0xe51d, R.drawable.emoji_1f5fd);
        sSoftbanksMap.put(0xe51e, R.drawable.emoji_1f482);
        sSoftbanksMap.put(0xe51f, R.drawable.emoji_1f483);
        sSoftbanksMap.put(0xe520, R.drawable.emoji_1f42c);
        sSoftbanksMap.put(0xe521, R.drawable.emoji_1f426);
        sSoftbanksMap.put(0xe522, R.drawable.emoji_1f420);
        sSoftbanksMap.put(0xe523, R.drawable.emoji_1f423);
        sSoftbanksMap.put(0xe524, R.drawable.emoji_1f439);
        sSoftbanksMap.put(0xe525, R.drawable.emoji_1f41b);
        sSoftbanksMap.put(0xe526, R.drawable.emoji_1f418);
        sSoftbanksMap.put(0xe527, R.drawable.emoji_1f428);
        sSoftbanksMap.put(0xe528, R.drawable.emoji_1f412);
        sSoftbanksMap.put(0xe529, R.drawable.emoji_1f411);
        sSoftbanksMap.put(0xe52a, R.drawable.emoji_1f43a);
        sSoftbanksMap.put(0xe52b, R.drawable.emoji_1f42e);
        sSoftbanksMap.put(0xe52c, R.drawable.emoji_1f430);
        sSoftbanksMap.put(0xe52d, R.drawable.emoji_1f40d);
        sSoftbanksMap.put(0xe52e, R.drawable.emoji_1f414);
        sSoftbanksMap.put(0xe52f, R.drawable.emoji_1f417);
        sSoftbanksMap.put(0xe530, R.drawable.emoji_1f42b);
        sSoftbanksMap.put(0xe531, R.drawable.emoji_1f438);
        sSoftbanksMap.put(0xe532, R.drawable.emoji_1f170);
        sSoftbanksMap.put(0xe533, R.drawable.emoji_1f171);
        sSoftbanksMap.put(0xe534, R.drawable.emoji_1f18e);
        sSoftbanksMap.put(0xe535, R.drawable.emoji_1f17e);
        sSoftbanksMap.put(0xe536, R.drawable.emoji_1f43e);
        sSoftbanksMap.put(0xe537, R.drawable.emoji_2122);
    
    
    ziad*/
    	
    	sEmojisMap.put(0x1f621, R.drawable.emoji_1f621);
    	sEmojisMap.put(0x1f3a4, R.drawable.emoji_1f3a4);
    	sEmojisMap.put(0x1f433, R.drawable.emoji_1f433);
    	sEmojisMap.put(0x1f43c, R.drawable.emoji_1f43c);
    	sEmojisMap.put(0x1f3b7, R.drawable.emoji_1f3b7);
    	sEmojisMap.put(0x1f42b, R.drawable.emoji_1f42b);
    	sEmojisMap.put(0x1f388, R.drawable.emoji_1f388);
    	sEmojisMap.put(0x1f43d, R.drawable.emoji_1f43d);
    	sEmojisMap.put(0x1f62a, R.drawable.emoji_1f62a);
    	sEmojisMap.put(0x1f60d, R.drawable.emoji_1f60d);
    	sEmojisMap.put(0x1f447, R.drawable.emoji_1f447);
    	sEmojisMap.put(0x1f446, R.drawable.emoji_1f446);
    	sEmojisMap.put(0x1f302, R.drawable.emoji_1f302);
    	sEmojisMap.put(0x1f370, R.drawable.emoji_1f370);
    	sEmojisMap.put(0x1f426, R.drawable.emoji_1f426);
    	sEmojisMap.put(0x26d4, R.drawable.emoji_26d4);
    	sEmojisMap.put(0x1f4a6, R.drawable.emoji_1f4a6);
    	sEmojisMap.put(0x1f61a, R.drawable.emoji_1f61a);
    	sEmojisMap.put(0x1f36c, R.drawable.emoji_1f36c);
    	sEmojisMap.put(0x1f30f, R.drawable.emoji_1f30f);
    	sEmojisMap.put(0x1f385, R.drawable.emoji_1f385);
    	sEmojisMap.put(0x1f424, R.drawable.emoji_1f424);
    	sEmojisMap.put(0x2615, R.drawable.emoji_2615);
    	sEmojisMap.put(0x1f4a5, R.drawable.emoji_1f4a5);
    	sEmojisMap.put(0x1f508, R.drawable.emoji_1f508);
    	sEmojisMap.put(0x1f33e, R.drawable.emoji_1f33e);
    	sEmojisMap.put(0x2709, R.drawable.emoji_2709);
    	sEmojisMap.put(0x1f4af, R.drawable.emoji_1f4af);
    	sEmojisMap.put(0x1f457, R.drawable.emoji_1f457);
    	sEmojisMap.put(0x26c4, R.drawable.emoji_26c4);
    	sEmojisMap.put(0x1f48b, R.drawable.emoji_1f48b);
    	sEmojisMap.put(0x1f377, R.drawable.emoji_1f377);
    	sEmojisMap.put(0x1f436, R.drawable.emoji_1f436);
    	sEmojisMap.put(0x1f60e, R.drawable.emoji_1f60e);
    	sEmojisMap.put(0x1f47e, R.drawable.emoji_1f47e);
    	sEmojisMap.put(0x1f63c, R.drawable.emoji_1f63c);
    	sEmojisMap.put(0x1f483, R.drawable.emoji_1f483);
    	sEmojisMap.put(0x1f49c, R.drawable.emoji_1f49c);
    	sEmojisMap.put(0x1f450, R.drawable.emoji_1f450);
    	sEmojisMap.put(0x1f44b, R.drawable.emoji_1f44b);
    	sEmojisMap.put(0x270c, R.drawable.emoji_270c);
    	sEmojisMap.put(0x1f638, R.drawable.emoji_1f638);
    	sEmojisMap.put(0x1f420, R.drawable.emoji_1f420);
    	sEmojisMap.put(0x1f616, R.drawable.emoji_1f616);
    	sEmojisMap.put(0x1f31c, R.drawable.emoji_1f31c);
    	sEmojisMap.put(0x1f484, R.drawable.emoji_1f484);
    	sEmojisMap.put(0x1f622, R.drawable.emoji_1f622);
    	sEmojisMap.put(0x23f0, R.drawable.emoji_23f0);
    	sEmojisMap.put(0x1f620, R.drawable.emoji_1f620);
    	sEmojisMap.put(0x1f466, R.drawable.emoji_1f466);
    	sEmojisMap.put(0x1f417, R.drawable.emoji_1f417);
    	sEmojisMap.put(0x1f634, R.drawable.emoji_1f634);
    	sEmojisMap.put(0x1f496, R.drawable.emoji_1f496);
    	sEmojisMap.put(0x1f60a, R.drawable.emoji_1f60a);
    	sEmojisMap.put(0x1f495, R.drawable.emoji_1f495);
    	sEmojisMap.put(0x1f49d, R.drawable.emoji_1f49d);
    	sEmojisMap.put(0x1f467, R.drawable.emoji_1f467);
    	sEmojisMap.put(0x1f497, R.drawable.emoji_1f497);
    	sEmojisMap.put(0x1f384, R.drawable.emoji_1f384);
    	sEmojisMap.put(0x1f61e, R.drawable.emoji_1f61e);
    	sEmojisMap.put(0x1f41f, R.drawable.emoji_1f41f);
    	sEmojisMap.put(0x1f454, R.drawable.emoji_1f454);
    	sEmojisMap.put(0x1f459, R.drawable.emoji_1f459);
    	sEmojisMap.put(0x1f319, R.drawable.emoji_1f319);
    	sEmojisMap.put(0x1f50c, R.drawable.emoji_1f50c);
    	sEmojisMap.put(0x1f438, R.drawable.emoji_1f438);
    	sEmojisMap.put(0x1f606, R.drawable.emoji_1f606);
    	sEmojisMap.put(0x1f431, R.drawable.emoji_1f431);
    	sEmojisMap.put(0x1f44f, R.drawable.emoji_1f44f);
    	sEmojisMap.put(0x1f4ad, R.drawable.emoji_1f4ad);
    	sEmojisMap.put(0x1f3c3, R.drawable.emoji_1f3c3);
    	sEmojisMap.put(0x1f60f, R.drawable.emoji_1f60f);
    	sEmojisMap.put(0x1f4a8, R.drawable.emoji_1f4a8);
    	sEmojisMap.put(0x1f440, R.drawable.emoji_1f440);
    	sEmojisMap.put(0x1f618, R.drawable.emoji_1f618);
    	sEmojisMap.put(0x1f619, R.drawable.emoji_1f619);
    	sEmojisMap.put(0x1f31b, R.drawable.emoji_1f31b);
    	sEmojisMap.put(0x1f421, R.drawable.emoji_1f421);
    	sEmojisMap.put(0x1f647, R.drawable.emoji_1f647);
    	sEmojisMap.put(0x1f425, R.drawable.emoji_1f425);
    	sEmojisMap.put(0x1f64f, R.drawable.emoji_1f64f);
    	sEmojisMap.put(0x1f63d, R.drawable.emoji_1f63d);
    	sEmojisMap.put(0x1f680, R.drawable.emoji_1f680);
    	sEmojisMap.put(0x1f3bb, R.drawable.emoji_1f3bb);
    	sEmojisMap.put(0x2744, R.drawable.emoji_2744);
    	sEmojisMap.put(0x1f351, R.drawable.emoji_1f351);
    	sEmojisMap.put(0x1f434, R.drawable.emoji_1f434);
    	sEmojisMap.put(0x1f639, R.drawable.emoji_1f639);
    	sEmojisMap.put(0x1f682, R.drawable.emoji_1f682);
    	sEmojisMap.put(0x1f633, R.drawable.emoji_1f633);
    	sEmojisMap.put(0x1f602, R.drawable.emoji_1f602);
    	sEmojisMap.put(0x1f43e, R.drawable.emoji_1f43e);
    	sEmojisMap.put(0x1f47f, R.drawable.emoji_1f47f);
    	sEmojisMap.put(0x1f475, R.drawable.emoji_1f475);
    	sEmojisMap.put(0x2600, R.drawable.emoji_2600);
    	sEmojisMap.put(0x1f63a, R.drawable.emoji_1f63a);
    	sEmojisMap.put(0x1f449, R.drawable.emoji_1f449);
    	sEmojisMap.put(0x2b50, R.drawable.emoji_2b50);
    	sEmojisMap.put(0x1f3b6, R.drawable.emoji_1f3b6);
    	sEmojisMap.put(0x1f600, R.drawable.emoji_1f600);
    	sEmojisMap.put(0x2728, R.drawable.emoji_2728);
    	sEmojisMap.put(0x1f451, R.drawable.emoji_1f451);
    	sEmojisMap.put(0x1f4b0, R.drawable.emoji_1f4b0);
    	sEmojisMap.put(0x1f44c, R.drawable.emoji_1f44c);
    	sEmojisMap.put(0x1f471, R.drawable.emoji_1f471);
    	sEmojisMap.put(0x1f493, R.drawable.emoji_1f493);
    	sEmojisMap.put(0x26be, R.drawable.emoji_26be);
    	sEmojisMap.put(0x1f41e, R.drawable.emoji_1f41e);
    	sEmojisMap.put(0x1f617, R.drawable.emoji_1f617);
    	sEmojisMap.put(0x1f31d, R.drawable.emoji_1f31d);
    	sEmojisMap.put(0x1f492, R.drawable.emoji_1f492);
    	sEmojisMap.put(0x1f498, R.drawable.emoji_1f498);
    	sEmojisMap.put(0x1f36b, R.drawable.emoji_1f36b);
    	sEmojisMap.put(0x1f378, R.drawable.emoji_1f378);
    	sEmojisMap.put(0x1f423, R.drawable.emoji_1f423);
    	sEmojisMap.put(0x1f626, R.drawable.emoji_1f626);
    	sEmojisMap.put(0x1f4a7, R.drawable.emoji_1f4a7);
    	sEmojisMap.put(0x1f47a, R.drawable.emoji_1f47a);
    	sEmojisMap.put(0x1f469, R.drawable.emoji_1f469);
    	sEmojisMap.put(0x1f640, R.drawable.emoji_1f640);
    	sEmojisMap.put(0x1f435, R.drawable.emoji_1f435);
    	sEmojisMap.put(0x1f6bf, R.drawable.emoji_1f6bf);
    	sEmojisMap.put(0x1f627, R.drawable.emoji_1f627);
    	sEmojisMap.put(0x1f47d, R.drawable.emoji_1f47d);
    	sEmojisMap.put(0x1f389, R.drawable.emoji_1f389);
    	sEmojisMap.put(0x1f62c, R.drawable.emoji_1f62c);
    	sEmojisMap.put(0x1f479, R.drawable.emoji_1f479);
    	sEmojisMap.put(0x1f3b9, R.drawable.emoji_1f3b9);
    	sEmojisMap.put(0x1f3a7, R.drawable.emoji_1f3a7);
    	sEmojisMap.put(0x1f456, R.drawable.emoji_1f456);
    	sEmojisMap.put(0x1f4aa, R.drawable.emoji_1f4aa);
    	sEmojisMap.put(0x1f43b, R.drawable.emoji_1f43b);
    	sEmojisMap.put(0x1f60b, R.drawable.emoji_1f60b);
    	sEmojisMap.put(0x1f3bc, R.drawable.emoji_1f3bc);
    	sEmojisMap.put(0x1f46b, R.drawable.emoji_1f46b);
    	sEmojisMap.put(0x1f366, R.drawable.emoji_1f366);
    	sEmojisMap.put(0x26f5, R.drawable.emoji_26f5);
    	sEmojisMap.put(0x1f62d, R.drawable.emoji_1f62d);
    	sEmojisMap.put(0x1f42f, R.drawable.emoji_1f42f);
    	sEmojisMap.put(0x1f60c, R.drawable.emoji_1f60c);
    	sEmojisMap.put(0x231a, R.drawable.emoji_231a);
    	sEmojisMap.put(0x2614, R.drawable.emoji_2614);
    	sEmojisMap.put(0x261d, R.drawable.emoji_261d);
    	sEmojisMap.put(0x1f615, R.drawable.emoji_1f615);
    	sEmojisMap.put(0x1f37c, R.drawable.emoji_1f37c);
    	sEmojisMap.put(0x26a1, R.drawable.emoji_26a1);
    	sEmojisMap.put(0x1f444, R.drawable.emoji_1f444);
    	sEmojisMap.put(0x1f42a, R.drawable.emoji_1f42a);
    	sEmojisMap.put(0x1f485, R.drawable.emoji_1f485);
    	sEmojisMap.put(0x1f448, R.drawable.emoji_1f448);
    	sEmojisMap.put(0x1f413, R.drawable.emoji_1f413);
    	sEmojisMap.put(0x1f478, R.drawable.emoji_1f478);
    	sEmojisMap.put(0x1f603, R.drawable.emoji_1f603);
    	sEmojisMap.put(0x1f499, R.drawable.emoji_1f499);
    	sEmojisMap.put(0x1f337, R.drawable.emoji_1f337);
    	sEmojisMap.put(0x1f47b, R.drawable.emoji_1f47b);
    	sEmojisMap.put(0x1f350, R.drawable.emoji_1f350);
    	sEmojisMap.put(0x1f3ba, R.drawable.emoji_1f3ba);
    	sEmojisMap.put(0x1f42c, R.drawable.emoji_1f42c);
    	sEmojisMap.put(0x1f427, R.drawable.emoji_1f427);
    	sEmojisMap.put(0x1f419, R.drawable.emoji_1f419);
    	sEmojisMap.put(0x1f353, R.drawable.emoji_1f353);
    	sEmojisMap.put(0x1f646, R.drawable.emoji_1f646);
    	sEmojisMap.put(0x1f604, R.drawable.emoji_1f604);
    	sEmojisMap.put(0x1f452, R.drawable.emoji_1f452);
    	sEmojisMap.put(0x263a, R.drawable.emoji_263a);
    	sEmojisMap.put(0x1f491, R.drawable.emoji_1f491);
    	sEmojisMap.put(0x1f61f, R.drawable.emoji_1f61f);
    	sEmojisMap.put(0x1f645, R.drawable.emoji_1f645);
    	sEmojisMap.put(0x1f458, R.drawable.emoji_1f458);
    	sEmojisMap.put(0x1f49e, R.drawable.emoji_1f49e);
    	sEmojisMap.put(0x1f61b, R.drawable.emoji_1f61b);
    	sEmojisMap.put(0x1f48d, R.drawable.emoji_1f48d);
    	sEmojisMap.put(0x1f612, R.drawable.emoji_1f612);
    	sEmojisMap.put(0x1f368, R.drawable.emoji_1f368);
    	sEmojisMap.put(0x1f486, R.drawable.emoji_1f486);
    	sEmojisMap.put(0x1f42d, R.drawable.emoji_1f42d);
    	sEmojisMap.put(0x1f629, R.drawable.emoji_1f629);
    	sEmojisMap.put(0x1f453, R.drawable.emoji_1f453);
    	sEmojisMap.put(0x2693, R.drawable.emoji_2693);
    	sEmojisMap.put(0x1f64a, R.drawable.emoji_1f64a);
    	sEmojisMap.put(0x1f632, R.drawable.emoji_1f632);
    	sEmojisMap.put(0x1f608, R.drawable.emoji_1f608);
    	sEmojisMap.put(0x1f31f, R.drawable.emoji_1f31f);
    	sEmojisMap.put(0x2601, R.drawable.emoji_2601);
    	sEmojisMap.put(0x1f487, R.drawable.emoji_1f487);
    	sEmojisMap.put(0x1f50e, R.drawable.emoji_1f50e);
    	sEmojisMap.put(0x1f45f, R.drawable.emoji_1f45f);
    	sEmojisMap.put(0x1f697, R.drawable.emoji_1f697);
    	sEmojisMap.put(0x1f3a8, R.drawable.emoji_1f3a8);
    	sEmojisMap.put(0x1f48f, R.drawable.emoji_1f48f);
    	sEmojisMap.put(0x1f432, R.drawable.emoji_1f432);
    	sEmojisMap.put(0x1f49b, R.drawable.emoji_1f49b);
    	sEmojisMap.put(0x1f49a, R.drawable.emoji_1f49a);
    	sEmojisMap.put(0x1f62f, R.drawable.emoji_1f62f);
    	sEmojisMap.put(0x1f64c, R.drawable.emoji_1f64c);
    	sEmojisMap.put(0x1f383, R.drawable.emoji_1f383);
    	sEmojisMap.put(0x1f379, R.drawable.emoji_1f379);
    	sEmojisMap.put(0x1f48e, R.drawable.emoji_1f48e);
    	sEmojisMap.put(0x1f338, R.drawable.emoji_1f338);
    	sEmojisMap.put(0x1f62e, R.drawable.emoji_1f62e);
    	sEmojisMap.put(0x1f607, R.drawable.emoji_1f607);
    	sEmojisMap.put(0x26bd, R.drawable.emoji_26bd);
    	sEmojisMap.put(0x1f628, R.drawable.emoji_1f628);
    	sEmojisMap.put(0x1f36d, R.drawable.emoji_1f36d);
    	sEmojisMap.put(0x1f649, R.drawable.emoji_1f649);
    	sEmojisMap.put(0x1f624, R.drawable.emoji_1f624);
    	sEmojisMap.put(0x1f429, R.drawable.emoji_1f429);
    	sEmojisMap.put(0x1f609, R.drawable.emoji_1f609);
    	sEmojisMap.put(0x1f349, R.drawable.emoji_1f349);
    	sEmojisMap.put(0x1f601, R.drawable.emoji_1f601);
    	sEmojisMap.put(0x1f62b, R.drawable.emoji_1f62b);
    	sEmojisMap.put(0x1f369, R.drawable.emoji_1f369);
    	sEmojisMap.put(0x1f514, R.drawable.emoji_1f514);
    	sEmojisMap.put(0x1f455, R.drawable.emoji_1f455);
    	sEmojisMap.put(0x1f463, R.drawable.emoji_1f463);
    	sEmojisMap.put(0x1f412, R.drawable.emoji_1f412);
    	sEmojisMap.put(0x1f352, R.drawable.emoji_1f352);
    	sEmojisMap.put(0x1f46f, R.drawable.emoji_1f46f);
    	sEmojisMap.put(0x1f610, R.drawable.emoji_1f610);
    	sEmojisMap.put(0x1f375, R.drawable.emoji_1f375);
    	sEmojisMap.put(0x1f428, R.drawable.emoji_1f428);
    	sEmojisMap.put(0x1f430, R.drawable.emoji_1f430);
    	sEmojisMap.put(0x1f63f, R.drawable.emoji_1f63f);
    	sEmojisMap.put(0x1f468, R.drawable.emoji_1f468);
    	sEmojisMap.put(0x1f476, R.drawable.emoji_1f476);
    	sEmojisMap.put(0x1f477, R.drawable.emoji_1f477);
    	sEmojisMap.put(0x1f38a, R.drawable.emoji_1f38a);
    	sEmojisMap.put(0x231b, R.drawable.emoji_231b);
    	sEmojisMap.put(0x1f3b5, R.drawable.emoji_1f3b5);
    	sEmojisMap.put(0x1f354, R.drawable.emoji_1f354);
    	sEmojisMap.put(0x1f445, R.drawable.emoji_1f445);
    	sEmojisMap.put(0x1f47c, R.drawable.emoji_1f47c);
    	sEmojisMap.put(0x1f613, R.drawable.emoji_1f613);
    	sEmojisMap.put(0x1f460, R.drawable.emoji_1f460);
    	sEmojisMap.put(0x1f43a, R.drawable.emoji_1f43a);
    	sEmojisMap.put(0x1f61c, R.drawable.emoji_1f61c);
    	sEmojisMap.put(0x1f31e, R.drawable.emoji_1f31e);
    	sEmojisMap.put(0x1f3b8, R.drawable.emoji_1f3b8);
    	sEmojisMap.put(0x1f614, R.drawable.emoji_1f614);
    	sEmojisMap.put(0x1f381, R.drawable.emoji_1f381);
    	sEmojisMap.put(0x1f374, R.drawable.emoji_1f374);
    	sEmojisMap.put(0x1f6b6, R.drawable.emoji_1f6b6);
    	sEmojisMap.put(0x1f611, R.drawable.emoji_1f611);
    	sEmojisMap.put(0x1f4a4, R.drawable.emoji_1f4a4);
    	sEmojisMap.put(0x1f46d, R.drawable.emoji_1f46d);
    	sEmojisMap.put(0x1f367, R.drawable.emoji_1f367);
    	sEmojisMap.put(0x1f4e3, R.drawable.emoji_1f4e3);
    	sEmojisMap.put(0x1f63b, R.drawable.emoji_1f63b);
    	sEmojisMap.put(0x1f63e, R.drawable.emoji_1f63e);
    	sEmojisMap.put(0x2712, R.drawable.emoji_2712);
    	sEmojisMap.put(0x1f437, R.drawable.emoji_1f437);
    	sEmojisMap.put(0x1f480, R.drawable.emoji_1f480);
    	sEmojisMap.put(0x1f30e, R.drawable.emoji_1f30e);
    	sEmojisMap.put(0x1f61d, R.drawable.emoji_1f61d);
    	sEmojisMap.put(0x1f33f, R.drawable.emoji_1f33f);
    	sEmojisMap.put(0x1f30d, R.drawable.emoji_1f30d);
    	sEmojisMap.put(0x1f630, R.drawable.emoji_1f630);
    	sEmojisMap.put(0x1f631, R.drawable.emoji_1f631);
    	sEmojisMap.put(0x1f44e, R.drawable.emoji_1f44e);
    	sEmojisMap.put(0x1f4a9, R.drawable.emoji_1f4a9);
    	sEmojisMap.put(0x1f46e, R.drawable.emoji_1f46e);
    	sEmojisMap.put(0x1f4ab, R.drawable.emoji_1f4ab);
    	sEmojisMap.put(0x1f414, R.drawable.emoji_1f414);
    	sEmojisMap.put(0x2668, R.drawable.emoji_2668);
    	sEmojisMap.put(0x2764, R.drawable.emoji_2764);
    	sEmojisMap.put(0x1f64b, R.drawable.emoji_1f64b);
    	sEmojisMap.put(0x1f474, R.drawable.emoji_1f474);
    	sEmojisMap.put(0x1f625, R.drawable.emoji_1f625);
    	sEmojisMap.put(0x1f44d, R.drawable.emoji_1f44d);
    	sEmojisMap.put(0x1f635, R.drawable.emoji_1f635);
    	sEmojisMap.put(0x1f48c, R.drawable.emoji_1f48c);
    	sEmojisMap.put(0x1f380, R.drawable.emoji_1f380);
    	sEmojisMap.put(0x1f637, R.drawable.emoji_1f637);
    	sEmojisMap.put(0x1f481, R.drawable.emoji_1f481);
    	sEmojisMap.put(0x1f41d, R.drawable.emoji_1f41d);
    	sEmojisMap.put(0x1f470, R.drawable.emoji_1f470);
    	sEmojisMap.put(0x1f44a, R.drawable.emoji_1f44a);
    	sEmojisMap.put(0x1f490, R.drawable.emoji_1f490);
    	sEmojisMap.put(0x1f339, R.drawable.emoji_1f339);
    	sEmojisMap.put(0x1f605, R.drawable.emoji_1f605);
    	sEmojisMap.put(0x1f46c, R.drawable.emoji_1f46c);
    	sEmojisMap.put(0x1f494, R.drawable.emoji_1f494);
    	sEmojisMap.put(0x260e, R.drawable.emoji_260e);
    	sEmojisMap.put(0x1f525, R.drawable.emoji_1f525);
    	sEmojisMap.put(0x26c5, R.drawable.emoji_26c5);
    	sEmojisMap.put(0x2708, R.drawable.emoji_2708);
    	sEmojisMap.put(0x1f482, R.drawable.emoji_1f482);
    	sEmojisMap.put(0x1f422, R.drawable.emoji_1f422);
    	sEmojisMap.put(0x1f473, R.drawable.emoji_1f473);
    	sEmojisMap.put(0x1f439, R.drawable.emoji_1f439);
    	sEmojisMap.put(0x1f46a, R.drawable.emoji_1f46a);
    	sEmojisMap.put(0x1f382, R.drawable.emoji_1f382);
    	sEmojisMap.put(0x1f623, R.drawable.emoji_1f623);
    	sEmojisMap.put(0x1f42e, R.drawable.emoji_1f42e);
    	sEmojisMap.put(0x1f418, R.drawable.emoji_1f418);
    	sEmojisMap.put(0x1f636, R.drawable.emoji_1f636);
    	sEmojisMap.put(0x1f648, R.drawable.emoji_1f648);
    	sEmojisMap.put(0x1f472, R.drawable.emoji_1f472);
    }

    private static boolean isSoftBankEmoji(char c) {
        return ((c >> 12) == 0xe);
    }

    private static int getEmojiResource(Context context, int codePoint) {
        return sEmojisMap.get(codePoint);
    }

    private static int getSoftbankEmojiResource(char c) {
        return sSoftbanksMap.get(c);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int textSize) {
        addEmojis(context, text, emojiSize, textSize, 0, -1, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param index
     * @param length
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int textSize, int index, int length) {
        addEmojis(context, text, emojiSize, textSize, index, length, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int textSize, boolean useSystemDefault) {
        addEmojis(context, text, emojiSize, textSize, 0, -1, useSystemDefault);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param index
     * @param length
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int textSize, int index, int length, boolean useSystemDefault) {
        if (useSystemDefault) {
            return;
        }

        int textLength = text.length();
        int textLengthToProcessMax = textLength - index;
        int textLengthToProcess = length < 0 || length >= textLengthToProcessMax ? textLength : (length+index);

        // remove spans throughout all text
        EmojiconSpan[] oldSpans = text.getSpans(0, textLength, EmojiconSpan.class);
        for (int i = 0; i < oldSpans.length; i++) {
            text.removeSpan(oldSpans[i]);
        }

        int skip;
        for (int i = index; i < textLengthToProcess; i += skip) {
            skip = 0;
            int icon = 0;
            char c = text.charAt(i);
            if (isSoftBankEmoji(c)) {
                icon = getSoftbankEmojiResource(c);
                skip = icon == 0 ? 0 : 1;
            }

            if (icon == 0) {
                int unicode = Character.codePointAt(text, i);
                skip = Character.charCount(unicode);

                if (unicode > 0xff) {
                    icon = getEmojiResource(context, unicode);
                }

                if (icon == 0 && i + skip < textLengthToProcess) {
                    int followUnicode = Character.codePointAt(text, i + skip);
                    if (followUnicode == 0x20e3) {
                        int followSkip = Character.charCount(followUnicode);
                        switch (unicode) {
                            case 0x0031:
                      //          icon = R.drawable.emoji_0031;
                                break;
                            case 0x0032:
                        //        icon = R.drawable.emoji_0032;
                                break;
                            case 0x0033:
                          //      icon = R.drawable.emoji_0033;
                                break;
                            case 0x0034:
                 //               icon = R.drawable.emoji_0034;
                                break;
                            case 0x0035:
                  //              icon = R.drawable.emoji_0035;
                                break;
                            case 0x0036:
                   //             icon = R.drawable.emoji_0036;
                                break;
                            case 0x0037:
                    //            icon = R.drawable.emoji_0037;
                                break;
                            case 0x0038:
                      //          icon = R.drawable.emoji_0038;
                                break;
                            case 0x0039:
                      //          icon = R.drawable.emoji_0039;
                                break;
                            case 0x0030:
                      //          icon = R.drawable.emoji_0030;
                                break;
                            case 0x0023:
                      //          icon = R.drawable.emoji_0023;
                                break;
                            default:
                                followSkip = 0;
                                break;
                        }
                        skip += followSkip;
                    } else {
                        int followSkip = Character.charCount(followUnicode);
                        switch (unicode) {
                           case 0x1f1ef:
                    //            icon = (followUnicode == 0x1f1f5) ? R.drawable.emoji_1f1ef_1f1f5 : 0;
                                break;
                            case 0x1f1fa:
                     //           icon = (followUnicode == 0x1f1f8) ? R.drawable.emoji_1f1fa_1f1f8 : 0;
                                break;
                            case 0x1f1eb:
                      //          icon = (followUnicode == 0x1f1f7) ? R.drawable.emoji_1f1eb_1f1f7 : 0;
                                break;
                            case 0x1f1e9:
                      //          icon = (followUnicode == 0x1f1ea) ? R.drawable.emoji_1f1e9_1f1ea : 0;
                                break;
                            case 0x1f1ee:
                       //         icon = (followUnicode == 0x1f1f9) ? R.drawable.emoji_1f1ee_1f1f9 : 0;
                                break;
                            case 0x1f1ec:
                       //         icon = (followUnicode == 0x1f1e7) ? R.drawable.emoji_1f1ec_1f1e7 : 0;
                                break;
                            case 0x1f1ea:
                       //         icon = (followUnicode == 0x1f1f8) ? R.drawable.emoji_1f1ea_1f1f8 : 0;
                                break;
                            case 0x1f1f7:
                       //         icon = (followUnicode == 0x1f1fa) ? R.drawable.emoji_1f1f7_1f1fa : 0;
                                break;
                            case 0x1f1e8:
                       //         icon = (followUnicode == 0x1f1f3) ? R.drawable.emoji_1f1e8_1f1f3 : 0;
                                break;
                            case 0x1f1f0:
                       //         icon = (followUnicode == 0x1f1f7) ? R.drawable.emoji_1f1f0_1f1f7 : 0;
                                break;
                            default:
                                followSkip = 0;
                                break;
                        }
                        skip += followSkip;
                    }
                }
            }

            if (icon > 0) {
                text.setSpan(new EmojiconSpan(context, icon, emojiSize, textSize), i, i + skip, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
    }
}
