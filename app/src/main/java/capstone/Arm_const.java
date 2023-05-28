// For Capstone Engine. AUTO-GENERATED FILE, DO NOT EDIT
package capstone;

import android.util.*;
import java.lang.reflect.*;
import java.util.*;

public class Arm_const
{

    // ARM shift type

    public static final int ARM_SFT_INVALID = 0;
    public static final int ARM_SFT_ASR = 1;
    public static final int ARM_SFT_LSL = 2;
    public static final int ARM_SFT_LSR = 3;
    public static final int ARM_SFT_ROR = 4;
    public static final int ARM_SFT_RRX = 5;
    public static final int ARM_SFT_ASR_REG = 6;
    public static final int ARM_SFT_LSL_REG = 7;
    public static final int ARM_SFT_LSR_REG = 8;
    public static final int ARM_SFT_ROR_REG = 9;
    public static final int ARM_SFT_RRX_REG = 10;

    // ARM condition code

    public static final int ARM_CC_INVALID = 0;
    public static final int ARM_CC_EQ = 1;
    public static final int ARM_CC_NE = 2;
    public static final int ARM_CC_HS = 3;
    public static final int ARM_CC_LO = 4;
    public static final int ARM_CC_MI = 5;
    public static final int ARM_CC_PL = 6;
    public static final int ARM_CC_VS = 7;
    public static final int ARM_CC_VC = 8;
    public static final int ARM_CC_HI = 9;
    public static final int ARM_CC_LS = 10;
    public static final int ARM_CC_GE = 11;
    public static final int ARM_CC_LT = 12;
    public static final int ARM_CC_GT = 13;
    public static final int ARM_CC_LE = 14;
    public static final int ARM_CC_AL = 15;
    private static final Map<Integer, String> _int2string;

    static
    {
        final Map<Integer, String> int2string = new HashMap<>();

        try
        {
            for (Field field : Arm_const.class.getFields())
            {
                final int mod = field.getModifiers();

                if (!int.class.equals(field.getType()))
                    continue;

                if (!Modifier.isStatic(mod) || !Modifier.isPublic(mod))
                    continue;

                if (!field.getName().startsWith("ARM_CC_"))
                    continue;

                int2string.put(field.getInt(null),
                               field.getName().substring("ARM_CC_".length()));
            }
        }
        catch (IllegalAccessException l_e)
        {
            throw new RuntimeException(l_e); // should not occur
        }

        _int2string = Collections.unmodifiableMap(int2string);
    }

    public static String getCCName(int cc)
    {
        return _int2string.get(cc);
    }
    public static String getCCName2(int cc)
    {
        Class clazz = Arm_const.class;
        Field[] fields = clazz.getFields();
        for(Field f : fields)
        {
            String s = f.getName();
            if(s.contains("ARM_CC_"))
                try
                {
                    if (((int)f.get(null)) == cc)
                    {
                        return s.replace("ARM_CC_", "");
                    }
                }
                catch (IllegalAccessException e)
                {
                    Log.e("Disassembler", "", e);
                }
                catch (IllegalArgumentException e)
                {
                    Log.e("Disassembler", "", e);
                }
        }
        return "";
    }
    // Special registers for MSR

    public static final int ARM_SYSREG_INVALID = 0;
    public static final int ARM_SYSREG_SPSR_C = 1;
    public static final int ARM_SYSREG_SPSR_X = 2;
    public static final int ARM_SYSREG_SPSR_S = 4;
    public static final int ARM_SYSREG_SPSR_F = 8;
    public static final int ARM_SYSREG_CPSR_C = 16;
    public static final int ARM_SYSREG_CPSR_X = 32;
    public static final int ARM_SYSREG_CPSR_S = 64;
    public static final int ARM_SYSREG_CPSR_F = 128;
    public static final int ARM_SYSREG_APSR = 256;
    public static final int ARM_SYSREG_APSR_G = 257;
    public static final int ARM_SYSREG_APSR_NZCVQ = 258;
    public static final int ARM_SYSREG_APSR_NZCVQG = 259;
    public static final int ARM_SYSREG_IAPSR = 260;
    public static final int ARM_SYSREG_IAPSR_G = 261;
    public static final int ARM_SYSREG_IAPSR_NZCVQG = 262;
    public static final int ARM_SYSREG_EAPSR = 263;
    public static final int ARM_SYSREG_EAPSR_G = 264;
    public static final int ARM_SYSREG_EAPSR_NZCVQG = 265;
    public static final int ARM_SYSREG_XPSR = 266;
    public static final int ARM_SYSREG_XPSR_G = 267;
    public static final int ARM_SYSREG_XPSR_NZCVQG = 268;
    public static final int ARM_SYSREG_IPSR = 269;
    public static final int ARM_SYSREG_EPSR = 270;
    public static final int ARM_SYSREG_IEPSR = 271;
    public static final int ARM_SYSREG_MSP = 272;
    public static final int ARM_SYSREG_PSP = 273;
    public static final int ARM_SYSREG_PRIMASK = 274;
    public static final int ARM_SYSREG_BASEPRI = 275;
    public static final int ARM_SYSREG_BASEPRI_MAX = 276;
    public static final int ARM_SYSREG_FAULTMASK = 277;
    public static final int ARM_SYSREG_CONTROL = 278;

    // The memory barrier constants map directly to the 4-bit encoding of

    // the option field for Memory Barrier operations.

    public static final int ARM_MB_INVALID = 0;
    public static final int ARM_MB_RESERVED_0 = 1;
    public static final int ARM_MB_OSHLD = 2;
    public static final int ARM_MB_OSHST = 3;
    public static final int ARM_MB_OSH = 4;
    public static final int ARM_MB_RESERVED_4 = 5;
    public static final int ARM_MB_NSHLD = 6;
    public static final int ARM_MB_NSHST = 7;
    public static final int ARM_MB_NSH = 8;
    public static final int ARM_MB_RESERVED_8 = 9;
    public static final int ARM_MB_ISHLD = 10;
    public static final int ARM_MB_ISHST = 11;
    public static final int ARM_MB_ISH = 12;
    public static final int ARM_MB_RESERVED_12 = 13;
    public static final int ARM_MB_LD = 14;
    public static final int ARM_MB_ST = 15;
    public static final int ARM_MB_SY = 16;

    // Operand type for instruction's operands

    public static final int ARM_OP_INVALID = 0;
    public static final int ARM_OP_REG = 1;
    public static final int ARM_OP_IMM = 2;
    public static final int ARM_OP_MEM = 3;
    public static final int ARM_OP_FP = 4;
    public static final int ARM_OP_CIMM = 64;
    public static final int ARM_OP_PIMM = 65;
    public static final int ARM_OP_SETEND = 66;
    public static final int ARM_OP_SYSREG = 67;

    // Operand type for SETEND instruction

    public static final int ARM_SETEND_INVALID = 0;
    public static final int ARM_SETEND_BE = 1;
    public static final int ARM_SETEND_LE = 2;

    public static final int ARM_CPSMODE_INVALID = 0;
    public static final int ARM_CPSMODE_IE = 2;
    public static final int ARM_CPSMODE_ID = 3;

    // Operand type for SETEND instruction

    public static final int ARM_CPSFLAG_INVALID = 0;
    public static final int ARM_CPSFLAG_F = 1;
    public static final int ARM_CPSFLAG_I = 2;
    public static final int ARM_CPSFLAG_A = 4;
    public static final int ARM_CPSFLAG_NONE = 16;

    // Data type for elements of vector instructions.

    public static final int ARM_VECTORDATA_INVALID = 0;
    public static final int ARM_VECTORDATA_I8 = 1;
    public static final int ARM_VECTORDATA_I16 = 2;
    public static final int ARM_VECTORDATA_I32 = 3;
    public static final int ARM_VECTORDATA_I64 = 4;
    public static final int ARM_VECTORDATA_S8 = 5;
    public static final int ARM_VECTORDATA_S16 = 6;
    public static final int ARM_VECTORDATA_S32 = 7;
    public static final int ARM_VECTORDATA_S64 = 8;
    public static final int ARM_VECTORDATA_U8 = 9;
    public static final int ARM_VECTORDATA_U16 = 10;
    public static final int ARM_VECTORDATA_U32 = 11;
    public static final int ARM_VECTORDATA_U64 = 12;
    public static final int ARM_VECTORDATA_P8 = 13;
    public static final int ARM_VECTORDATA_F32 = 14;
    public static final int ARM_VECTORDATA_F64 = 15;
    public static final int ARM_VECTORDATA_F16F64 = 16;
    public static final int ARM_VECTORDATA_F64F16 = 17;
    public static final int ARM_VECTORDATA_F32F16 = 18;
    public static final int ARM_VECTORDATA_F16F32 = 19;
    public static final int ARM_VECTORDATA_F64F32 = 20;
    public static final int ARM_VECTORDATA_F32F64 = 21;
    public static final int ARM_VECTORDATA_S32F32 = 22;
    public static final int ARM_VECTORDATA_U32F32 = 23;
    public static final int ARM_VECTORDATA_F32S32 = 24;
    public static final int ARM_VECTORDATA_F32U32 = 25;
    public static final int ARM_VECTORDATA_F64S16 = 26;
    public static final int ARM_VECTORDATA_F32S16 = 27;
    public static final int ARM_VECTORDATA_F64S32 = 28;
    public static final int ARM_VECTORDATA_S16F64 = 29;
    public static final int ARM_VECTORDATA_S16F32 = 30;
    public static final int ARM_VECTORDATA_S32F64 = 31;
    public static final int ARM_VECTORDATA_U16F64 = 32;
    public static final int ARM_VECTORDATA_U16F32 = 33;
    public static final int ARM_VECTORDATA_U32F64 = 34;
    public static final int ARM_VECTORDATA_F64U16 = 35;
    public static final int ARM_VECTORDATA_F32U16 = 36;
    public static final int ARM_VECTORDATA_F64U32 = 37;

    // ARM registers

    public static final int ARM_REG_INVALID = 0;
    public static final int ARM_REG_APSR = 1;
    public static final int ARM_REG_APSR_NZCV = 2;
    public static final int ARM_REG_CPSR = 3;
    public static final int ARM_REG_FPEXC = 4;
    public static final int ARM_REG_FPINST = 5;
    public static final int ARM_REG_FPSCR = 6;
    public static final int ARM_REG_FPSCR_NZCV = 7;
    public static final int ARM_REG_FPSID = 8;
    public static final int ARM_REG_ITSTATE = 9;
    public static final int ARM_REG_LR = 10;
    public static final int ARM_REG_PC = 11;
    public static final int ARM_REG_SP = 12;
    public static final int ARM_REG_SPSR = 13;
    public static final int ARM_REG_D0 = 14;
    public static final int ARM_REG_D1 = 15;
    public static final int ARM_REG_D2 = 16;
    public static final int ARM_REG_D3 = 17;
    public static final int ARM_REG_D4 = 18;
    public static final int ARM_REG_D5 = 19;
    public static final int ARM_REG_D6 = 20;
    public static final int ARM_REG_D7 = 21;
    public static final int ARM_REG_D8 = 22;
    public static final int ARM_REG_D9 = 23;
    public static final int ARM_REG_D10 = 24;
    public static final int ARM_REG_D11 = 25;
    public static final int ARM_REG_D12 = 26;
    public static final int ARM_REG_D13 = 27;
    public static final int ARM_REG_D14 = 28;
    public static final int ARM_REG_D15 = 29;
    public static final int ARM_REG_D16 = 30;
    public static final int ARM_REG_D17 = 31;
    public static final int ARM_REG_D18 = 32;
    public static final int ARM_REG_D19 = 33;
    public static final int ARM_REG_D20 = 34;
    public static final int ARM_REG_D21 = 35;
    public static final int ARM_REG_D22 = 36;
    public static final int ARM_REG_D23 = 37;
    public static final int ARM_REG_D24 = 38;
    public static final int ARM_REG_D25 = 39;
    public static final int ARM_REG_D26 = 40;
    public static final int ARM_REG_D27 = 41;
    public static final int ARM_REG_D28 = 42;
    public static final int ARM_REG_D29 = 43;
    public static final int ARM_REG_D30 = 44;
    public static final int ARM_REG_D31 = 45;
    public static final int ARM_REG_FPINST2 = 46;
    public static final int ARM_REG_MVFR0 = 47;
    public static final int ARM_REG_MVFR1 = 48;
    public static final int ARM_REG_MVFR2 = 49;
    public static final int ARM_REG_Q0 = 50;
    public static final int ARM_REG_Q1 = 51;
    public static final int ARM_REG_Q2 = 52;
    public static final int ARM_REG_Q3 = 53;
    public static final int ARM_REG_Q4 = 54;
    public static final int ARM_REG_Q5 = 55;
    public static final int ARM_REG_Q6 = 56;
    public static final int ARM_REG_Q7 = 57;
    public static final int ARM_REG_Q8 = 58;
    public static final int ARM_REG_Q9 = 59;
    public static final int ARM_REG_Q10 = 60;
    public static final int ARM_REG_Q11 = 61;
    public static final int ARM_REG_Q12 = 62;
    public static final int ARM_REG_Q13 = 63;
    public static final int ARM_REG_Q14 = 64;
    public static final int ARM_REG_Q15 = 65;
    public static final int ARM_REG_R0 = 66;
    public static final int ARM_REG_R1 = 67;
    public static final int ARM_REG_R2 = 68;
    public static final int ARM_REG_R3 = 69;
    public static final int ARM_REG_R4 = 70;
    public static final int ARM_REG_R5 = 71;
    public static final int ARM_REG_R6 = 72;
    public static final int ARM_REG_R7 = 73;
    public static final int ARM_REG_R8 = 74;
    public static final int ARM_REG_R9 = 75;
    public static final int ARM_REG_R10 = 76;
    public static final int ARM_REG_R11 = 77;
    public static final int ARM_REG_R12 = 78;
    public static final int ARM_REG_S0 = 79;
    public static final int ARM_REG_S1 = 80;
    public static final int ARM_REG_S2 = 81;
    public static final int ARM_REG_S3 = 82;
    public static final int ARM_REG_S4 = 83;
    public static final int ARM_REG_S5 = 84;
    public static final int ARM_REG_S6 = 85;
    public static final int ARM_REG_S7 = 86;
    public static final int ARM_REG_S8 = 87;
    public static final int ARM_REG_S9 = 88;
    public static final int ARM_REG_S10 = 89;
    public static final int ARM_REG_S11 = 90;
    public static final int ARM_REG_S12 = 91;
    public static final int ARM_REG_S13 = 92;
    public static final int ARM_REG_S14 = 93;
    public static final int ARM_REG_S15 = 94;
    public static final int ARM_REG_S16 = 95;
    public static final int ARM_REG_S17 = 96;
    public static final int ARM_REG_S18 = 97;
    public static final int ARM_REG_S19 = 98;
    public static final int ARM_REG_S20 = 99;
    public static final int ARM_REG_S21 = 100;
    public static final int ARM_REG_S22 = 101;
    public static final int ARM_REG_S23 = 102;
    public static final int ARM_REG_S24 = 103;
    public static final int ARM_REG_S25 = 104;
    public static final int ARM_REG_S26 = 105;
    public static final int ARM_REG_S27 = 106;
    public static final int ARM_REG_S28 = 107;
    public static final int ARM_REG_S29 = 108;
    public static final int ARM_REG_S30 = 109;
    public static final int ARM_REG_S31 = 110;
    public static final int ARM_REG_ENDING = 111;

    // alias registers
    public static final int ARM_REG_R13 = ARM_REG_SP;
    public static final int ARM_REG_R14 = ARM_REG_LR;
    public static final int ARM_REG_R15 = ARM_REG_PC;
    public static final int ARM_REG_SB = ARM_REG_R9;
    public static final int ARM_REG_SL = ARM_REG_R10;
    public static final int ARM_REG_FP = ARM_REG_R11;
    public static final int ARM_REG_IP = ARM_REG_R12;

    // ARM instruction

    public static final int ARM_INS_INVALID = 0;
    public static final int ARM_INS_ADC = 1;
    public static final int ARM_INS_ADD = 2;
    public static final int ARM_INS_ADR = 3;
    public static final int ARM_INS_AESD = 4;
    public static final int ARM_INS_AESE = 5;
    public static final int ARM_INS_AESIMC = 6;
    public static final int ARM_INS_AESMC = 7;
    public static final int ARM_INS_AND = 8;
    public static final int ARM_INS_BFC = 9;
    public static final int ARM_INS_BFI = 10;
    public static final int ARM_INS_BIC = 11;
    public static final int ARM_INS_BKPT = 12;
    public static final int ARM_INS_BL = 13;
    public static final int ARM_INS_BLX = 14;
    public static final int ARM_INS_BX = 15;
    public static final int ARM_INS_BXJ = 16;
    public static final int ARM_INS_B = 17;
    public static final int ARM_INS_CDP = 18;
    public static final int ARM_INS_CDP2 = 19;
    public static final int ARM_INS_CLREX = 20;
    public static final int ARM_INS_CLZ = 21;
    public static final int ARM_INS_CMN = 22;
    public static final int ARM_INS_CMP = 23;
    public static final int ARM_INS_CPS = 24;
    public static final int ARM_INS_CRC32B = 25;
    public static final int ARM_INS_CRC32CB = 26;
    public static final int ARM_INS_CRC32CH = 27;
    public static final int ARM_INS_CRC32CW = 28;
    public static final int ARM_INS_CRC32H = 29;
    public static final int ARM_INS_CRC32W = 30;
    public static final int ARM_INS_DBG = 31;
    public static final int ARM_INS_DMB = 32;
    public static final int ARM_INS_DSB = 33;
    public static final int ARM_INS_EOR = 34;
    public static final int ARM_INS_VMOV = 35;
    public static final int ARM_INS_FLDMDBX = 36;
    public static final int ARM_INS_FLDMIAX = 37;
    public static final int ARM_INS_VMRS = 38;
    public static final int ARM_INS_FSTMDBX = 39;
    public static final int ARM_INS_FSTMIAX = 40;
    public static final int ARM_INS_HINT = 41;
    public static final int ARM_INS_HLT = 42;
    public static final int ARM_INS_ISB = 43;
    public static final int ARM_INS_LDA = 44;
    public static final int ARM_INS_LDAB = 45;
    public static final int ARM_INS_LDAEX = 46;
    public static final int ARM_INS_LDAEXB = 47;
    public static final int ARM_INS_LDAEXD = 48;
    public static final int ARM_INS_LDAEXH = 49;
    public static final int ARM_INS_LDAH = 50;
    public static final int ARM_INS_LDC2L = 51;
    public static final int ARM_INS_LDC2 = 52;
    public static final int ARM_INS_LDCL = 53;
    public static final int ARM_INS_LDC = 54;
    public static final int ARM_INS_LDMDA = 55;
    public static final int ARM_INS_LDMDB = 56;
    public static final int ARM_INS_LDM = 57;
    public static final int ARM_INS_LDMIB = 58;
    public static final int ARM_INS_LDRBT = 59;
    public static final int ARM_INS_LDRB = 60;
    public static final int ARM_INS_LDRD = 61;
    public static final int ARM_INS_LDREX = 62;
    public static final int ARM_INS_LDREXB = 63;
    public static final int ARM_INS_LDREXD = 64;
    public static final int ARM_INS_LDREXH = 65;
    public static final int ARM_INS_LDRH = 66;
    public static final int ARM_INS_LDRHT = 67;
    public static final int ARM_INS_LDRSB = 68;
    public static final int ARM_INS_LDRSBT = 69;
    public static final int ARM_INS_LDRSH = 70;
    public static final int ARM_INS_LDRSHT = 71;
    public static final int ARM_INS_LDRT = 72;
    public static final int ARM_INS_LDR = 73;
    public static final int ARM_INS_MCR = 74;
    public static final int ARM_INS_MCR2 = 75;
    public static final int ARM_INS_MCRR = 76;
    public static final int ARM_INS_MCRR2 = 77;
    public static final int ARM_INS_MLA = 78;
    public static final int ARM_INS_MLS = 79;
    public static final int ARM_INS_MOV = 80;
    public static final int ARM_INS_MOVT = 81;
    public static final int ARM_INS_MOVW = 82;
    public static final int ARM_INS_MRC = 83;
    public static final int ARM_INS_MRC2 = 84;
    public static final int ARM_INS_MRRC = 85;
    public static final int ARM_INS_MRRC2 = 86;
    public static final int ARM_INS_MRS = 87;
    public static final int ARM_INS_MSR = 88;
    public static final int ARM_INS_MUL = 89;
    public static final int ARM_INS_MVN = 90;
    public static final int ARM_INS_ORR = 91;
    public static final int ARM_INS_PKHBT = 92;
    public static final int ARM_INS_PKHTB = 93;
    public static final int ARM_INS_PLDW = 94;
    public static final int ARM_INS_PLD = 95;
    public static final int ARM_INS_PLI = 96;
    public static final int ARM_INS_QADD = 97;
    public static final int ARM_INS_QADD16 = 98;
    public static final int ARM_INS_QADD8 = 99;
    public static final int ARM_INS_QASX = 100;
    public static final int ARM_INS_QDADD = 101;
    public static final int ARM_INS_QDSUB = 102;
    public static final int ARM_INS_QSAX = 103;
    public static final int ARM_INS_QSUB = 104;
    public static final int ARM_INS_QSUB16 = 105;
    public static final int ARM_INS_QSUB8 = 106;
    public static final int ARM_INS_RBIT = 107;
    public static final int ARM_INS_REV = 108;
    public static final int ARM_INS_REV16 = 109;
    public static final int ARM_INS_REVSH = 110;
    public static final int ARM_INS_RFEDA = 111;
    public static final int ARM_INS_RFEDB = 112;
    public static final int ARM_INS_RFEIA = 113;
    public static final int ARM_INS_RFEIB = 114;
    public static final int ARM_INS_RSB = 115;
    public static final int ARM_INS_RSC = 116;
    public static final int ARM_INS_SADD16 = 117;
    public static final int ARM_INS_SADD8 = 118;
    public static final int ARM_INS_SASX = 119;
    public static final int ARM_INS_SBC = 120;
    public static final int ARM_INS_SBFX = 121;
    public static final int ARM_INS_SDIV = 122;
    public static final int ARM_INS_SEL = 123;
    public static final int ARM_INS_SETEND = 124;
    public static final int ARM_INS_SHA1C = 125;
    public static final int ARM_INS_SHA1H = 126;
    public static final int ARM_INS_SHA1M = 127;
    public static final int ARM_INS_SHA1P = 128;
    public static final int ARM_INS_SHA1SU0 = 129;
    public static final int ARM_INS_SHA1SU1 = 130;
    public static final int ARM_INS_SHA256H = 131;
    public static final int ARM_INS_SHA256H2 = 132;
    public static final int ARM_INS_SHA256SU0 = 133;
    public static final int ARM_INS_SHA256SU1 = 134;
    public static final int ARM_INS_SHADD16 = 135;
    public static final int ARM_INS_SHADD8 = 136;
    public static final int ARM_INS_SHASX = 137;
    public static final int ARM_INS_SHSAX = 138;
    public static final int ARM_INS_SHSUB16 = 139;
    public static final int ARM_INS_SHSUB8 = 140;
    public static final int ARM_INS_SMC = 141;
    public static final int ARM_INS_SMLABB = 142;
    public static final int ARM_INS_SMLABT = 143;
    public static final int ARM_INS_SMLAD = 144;
    public static final int ARM_INS_SMLADX = 145;
    public static final int ARM_INS_SMLAL = 146;
    public static final int ARM_INS_SMLALBB = 147;
    public static final int ARM_INS_SMLALBT = 148;
    public static final int ARM_INS_SMLALD = 149;
    public static final int ARM_INS_SMLALDX = 150;
    public static final int ARM_INS_SMLALTB = 151;
    public static final int ARM_INS_SMLALTT = 152;
    public static final int ARM_INS_SMLATB = 153;
    public static final int ARM_INS_SMLATT = 154;
    public static final int ARM_INS_SMLAWB = 155;
    public static final int ARM_INS_SMLAWT = 156;
    public static final int ARM_INS_SMLSD = 157;
    public static final int ARM_INS_SMLSDX = 158;
    public static final int ARM_INS_SMLSLD = 159;
    public static final int ARM_INS_SMLSLDX = 160;
    public static final int ARM_INS_SMMLA = 161;
    public static final int ARM_INS_SMMLAR = 162;
    public static final int ARM_INS_SMMLS = 163;
    public static final int ARM_INS_SMMLSR = 164;
    public static final int ARM_INS_SMMUL = 165;
    public static final int ARM_INS_SMMULR = 166;
    public static final int ARM_INS_SMUAD = 167;
    public static final int ARM_INS_SMUADX = 168;
    public static final int ARM_INS_SMULBB = 169;
    public static final int ARM_INS_SMULBT = 170;
    public static final int ARM_INS_SMULL = 171;
    public static final int ARM_INS_SMULTB = 172;
    public static final int ARM_INS_SMULTT = 173;
    public static final int ARM_INS_SMULWB = 174;
    public static final int ARM_INS_SMULWT = 175;
    public static final int ARM_INS_SMUSD = 176;
    public static final int ARM_INS_SMUSDX = 177;
    public static final int ARM_INS_SRSDA = 178;
    public static final int ARM_INS_SRSDB = 179;
    public static final int ARM_INS_SRSIA = 180;
    public static final int ARM_INS_SRSIB = 181;
    public static final int ARM_INS_SSAT = 182;
    public static final int ARM_INS_SSAT16 = 183;
    public static final int ARM_INS_SSAX = 184;
    public static final int ARM_INS_SSUB16 = 185;
    public static final int ARM_INS_SSUB8 = 186;
    public static final int ARM_INS_STC2L = 187;
    public static final int ARM_INS_STC2 = 188;
    public static final int ARM_INS_STCL = 189;
    public static final int ARM_INS_STC = 190;
    public static final int ARM_INS_STL = 191;
    public static final int ARM_INS_STLB = 192;
    public static final int ARM_INS_STLEX = 193;
    public static final int ARM_INS_STLEXB = 194;
    public static final int ARM_INS_STLEXD = 195;
    public static final int ARM_INS_STLEXH = 196;
    public static final int ARM_INS_STLH = 197;
    public static final int ARM_INS_STMDA = 198;
    public static final int ARM_INS_STMDB = 199;
    public static final int ARM_INS_STM = 200;
    public static final int ARM_INS_STMIB = 201;
    public static final int ARM_INS_STRBT = 202;
    public static final int ARM_INS_STRB = 203;
    public static final int ARM_INS_STRD = 204;
    public static final int ARM_INS_STREX = 205;
    public static final int ARM_INS_STREXB = 206;
    public static final int ARM_INS_STREXD = 207;
    public static final int ARM_INS_STREXH = 208;
    public static final int ARM_INS_STRH = 209;
    public static final int ARM_INS_STRHT = 210;
    public static final int ARM_INS_STRT = 211;
    public static final int ARM_INS_STR = 212;
    public static final int ARM_INS_SUB = 213;
    public static final int ARM_INS_SVC = 214;
    public static final int ARM_INS_SWP = 215;
    public static final int ARM_INS_SWPB = 216;
    public static final int ARM_INS_SXTAB = 217;
    public static final int ARM_INS_SXTAB16 = 218;
    public static final int ARM_INS_SXTAH = 219;
    public static final int ARM_INS_SXTB = 220;
    public static final int ARM_INS_SXTB16 = 221;
    public static final int ARM_INS_SXTH = 222;
    public static final int ARM_INS_TEQ = 223;
    public static final int ARM_INS_TRAP = 224;
    public static final int ARM_INS_TST = 225;
    public static final int ARM_INS_UADD16 = 226;
    public static final int ARM_INS_UADD8 = 227;
    public static final int ARM_INS_UASX = 228;
    public static final int ARM_INS_UBFX = 229;
    public static final int ARM_INS_UDF = 230;
    public static final int ARM_INS_UDIV = 231;
    public static final int ARM_INS_UHADD16 = 232;
    public static final int ARM_INS_UHADD8 = 233;
    public static final int ARM_INS_UHASX = 234;
    public static final int ARM_INS_UHSAX = 235;
    public static final int ARM_INS_UHSUB16 = 236;
    public static final int ARM_INS_UHSUB8 = 237;
    public static final int ARM_INS_UMAAL = 238;
    public static final int ARM_INS_UMLAL = 239;
    public static final int ARM_INS_UMULL = 240;
    public static final int ARM_INS_UQADD16 = 241;
    public static final int ARM_INS_UQADD8 = 242;
    public static final int ARM_INS_UQASX = 243;
    public static final int ARM_INS_UQSAX = 244;
    public static final int ARM_INS_UQSUB16 = 245;
    public static final int ARM_INS_UQSUB8 = 246;
    public static final int ARM_INS_USAD8 = 247;
    public static final int ARM_INS_USADA8 = 248;
    public static final int ARM_INS_USAT = 249;
    public static final int ARM_INS_USAT16 = 250;
    public static final int ARM_INS_USAX = 251;
    public static final int ARM_INS_USUB16 = 252;
    public static final int ARM_INS_USUB8 = 253;
    public static final int ARM_INS_UXTAB = 254;
    public static final int ARM_INS_UXTAB16 = 255;
    public static final int ARM_INS_UXTAH = 256;
    public static final int ARM_INS_UXTB = 257;
    public static final int ARM_INS_UXTB16 = 258;
    public static final int ARM_INS_UXTH = 259;
    public static final int ARM_INS_VABAL = 260;
    public static final int ARM_INS_VABA = 261;
    public static final int ARM_INS_VABDL = 262;
    public static final int ARM_INS_VABD = 263;
    public static final int ARM_INS_VABS = 264;
    public static final int ARM_INS_VACGE = 265;
    public static final int ARM_INS_VACGT = 266;
    public static final int ARM_INS_VADD = 267;
    public static final int ARM_INS_VADDHN = 268;
    public static final int ARM_INS_VADDL = 269;
    public static final int ARM_INS_VADDW = 270;
    public static final int ARM_INS_VAND = 271;
    public static final int ARM_INS_VBIC = 272;
    public static final int ARM_INS_VBIF = 273;
    public static final int ARM_INS_VBIT = 274;
    public static final int ARM_INS_VBSL = 275;
    public static final int ARM_INS_VCEQ = 276;
    public static final int ARM_INS_VCGE = 277;
    public static final int ARM_INS_VCGT = 278;
    public static final int ARM_INS_VCLE = 279;
    public static final int ARM_INS_VCLS = 280;
    public static final int ARM_INS_VCLT = 281;
    public static final int ARM_INS_VCLZ = 282;
    public static final int ARM_INS_VCMP = 283;
    public static final int ARM_INS_VCMPE = 284;
    public static final int ARM_INS_VCNT = 285;
    public static final int ARM_INS_VCVTA = 286;
    public static final int ARM_INS_VCVTB = 287;
    public static final int ARM_INS_VCVT = 288;
    public static final int ARM_INS_VCVTM = 289;
    public static final int ARM_INS_VCVTN = 290;
    public static final int ARM_INS_VCVTP = 291;
    public static final int ARM_INS_VCVTT = 292;
    public static final int ARM_INS_VDIV = 293;
    public static final int ARM_INS_VDUP = 294;
    public static final int ARM_INS_VEOR = 295;
    public static final int ARM_INS_VEXT = 296;
    public static final int ARM_INS_VFMA = 297;
    public static final int ARM_INS_VFMS = 298;
    public static final int ARM_INS_VFNMA = 299;
    public static final int ARM_INS_VFNMS = 300;
    public static final int ARM_INS_VHADD = 301;
    public static final int ARM_INS_VHSUB = 302;
    public static final int ARM_INS_VLD1 = 303;
    public static final int ARM_INS_VLD2 = 304;
    public static final int ARM_INS_VLD3 = 305;
    public static final int ARM_INS_VLD4 = 306;
    public static final int ARM_INS_VLDMDB = 307;
    public static final int ARM_INS_VLDMIA = 308;
    public static final int ARM_INS_VLDR = 309;
    public static final int ARM_INS_VMAXNM = 310;
    public static final int ARM_INS_VMAX = 311;
    public static final int ARM_INS_VMINNM = 312;
    public static final int ARM_INS_VMIN = 313;
    public static final int ARM_INS_VMLA = 314;
    public static final int ARM_INS_VMLAL = 315;
    public static final int ARM_INS_VMLS = 316;
    public static final int ARM_INS_VMLSL = 317;
    public static final int ARM_INS_VMOVL = 318;
    public static final int ARM_INS_VMOVN = 319;
    public static final int ARM_INS_VMSR = 320;
    public static final int ARM_INS_VMUL = 321;
    public static final int ARM_INS_VMULL = 322;
    public static final int ARM_INS_VMVN = 323;
    public static final int ARM_INS_VNEG = 324;
    public static final int ARM_INS_VNMLA = 325;
    public static final int ARM_INS_VNMLS = 326;
    public static final int ARM_INS_VNMUL = 327;
    public static final int ARM_INS_VORN = 328;
    public static final int ARM_INS_VORR = 329;
    public static final int ARM_INS_VPADAL = 330;
    public static final int ARM_INS_VPADDL = 331;
    public static final int ARM_INS_VPADD = 332;
    public static final int ARM_INS_VPMAX = 333;
    public static final int ARM_INS_VPMIN = 334;
    public static final int ARM_INS_VQABS = 335;
    public static final int ARM_INS_VQADD = 336;
    public static final int ARM_INS_VQDMLAL = 337;
    public static final int ARM_INS_VQDMLSL = 338;
    public static final int ARM_INS_VQDMULH = 339;
    public static final int ARM_INS_VQDMULL = 340;
    public static final int ARM_INS_VQMOVUN = 341;
    public static final int ARM_INS_VQMOVN = 342;
    public static final int ARM_INS_VQNEG = 343;
    public static final int ARM_INS_VQRDMULH = 344;
    public static final int ARM_INS_VQRSHL = 345;
    public static final int ARM_INS_VQRSHRN = 346;
    public static final int ARM_INS_VQRSHRUN = 347;
    public static final int ARM_INS_VQSHL = 348;
    public static final int ARM_INS_VQSHLU = 349;
    public static final int ARM_INS_VQSHRN = 350;
    public static final int ARM_INS_VQSHRUN = 351;
    public static final int ARM_INS_VQSUB = 352;
    public static final int ARM_INS_VRADDHN = 353;
    public static final int ARM_INS_VRECPE = 354;
    public static final int ARM_INS_VRECPS = 355;
    public static final int ARM_INS_VREV16 = 356;
    public static final int ARM_INS_VREV32 = 357;
    public static final int ARM_INS_VREV64 = 358;
    public static final int ARM_INS_VRHADD = 359;
    public static final int ARM_INS_VRINTA = 360;
    public static final int ARM_INS_VRINTM = 361;
    public static final int ARM_INS_VRINTN = 362;
    public static final int ARM_INS_VRINTP = 363;
    public static final int ARM_INS_VRINTR = 364;
    public static final int ARM_INS_VRINTX = 365;
    public static final int ARM_INS_VRINTZ = 366;
    public static final int ARM_INS_VRSHL = 367;
    public static final int ARM_INS_VRSHRN = 368;
    public static final int ARM_INS_VRSHR = 369;
    public static final int ARM_INS_VRSQRTE = 370;
    public static final int ARM_INS_VRSQRTS = 371;
    public static final int ARM_INS_VRSRA = 372;
    public static final int ARM_INS_VRSUBHN = 373;
    public static final int ARM_INS_VSELEQ = 374;
    public static final int ARM_INS_VSELGE = 375;
    public static final int ARM_INS_VSELGT = 376;
    public static final int ARM_INS_VSELVS = 377;
    public static final int ARM_INS_VSHLL = 378;
    public static final int ARM_INS_VSHL = 379;
    public static final int ARM_INS_VSHRN = 380;
    public static final int ARM_INS_VSHR = 381;
    public static final int ARM_INS_VSLI = 382;
    public static final int ARM_INS_VSQRT = 383;
    public static final int ARM_INS_VSRA = 384;
    public static final int ARM_INS_VSRI = 385;
    public static final int ARM_INS_VST1 = 386;
    public static final int ARM_INS_VST2 = 387;
    public static final int ARM_INS_VST3 = 388;
    public static final int ARM_INS_VST4 = 389;
    public static final int ARM_INS_VSTMDB = 390;
    public static final int ARM_INS_VSTMIA = 391;
    public static final int ARM_INS_VSTR = 392;
    public static final int ARM_INS_VSUB = 393;
    public static final int ARM_INS_VSUBHN = 394;
    public static final int ARM_INS_VSUBL = 395;
    public static final int ARM_INS_VSUBW = 396;
    public static final int ARM_INS_VSWP = 397;
    public static final int ARM_INS_VTBL = 398;
    public static final int ARM_INS_VTBX = 399;
    public static final int ARM_INS_VCVTR = 400;
    public static final int ARM_INS_VTRN = 401;
    public static final int ARM_INS_VTST = 402;
    public static final int ARM_INS_VUZP = 403;
    public static final int ARM_INS_VZIP = 404;
    public static final int ARM_INS_ADDW = 405;
    public static final int ARM_INS_ASR = 406;
    public static final int ARM_INS_DCPS1 = 407;
    public static final int ARM_INS_DCPS2 = 408;
    public static final int ARM_INS_DCPS3 = 409;
    public static final int ARM_INS_IT = 410;
    public static final int ARM_INS_LSL = 411;
    public static final int ARM_INS_LSR = 412;
    public static final int ARM_INS_ASRS = 413;
    public static final int ARM_INS_LSRS = 414;
    public static final int ARM_INS_ORN = 415;
    public static final int ARM_INS_ROR = 416;
    public static final int ARM_INS_RRX = 417;
    public static final int ARM_INS_SUBS = 418;
    public static final int ARM_INS_SUBW = 419;
    public static final int ARM_INS_TBB = 420;
    public static final int ARM_INS_TBH = 421;
    public static final int ARM_INS_CBNZ = 422;
    public static final int ARM_INS_CBZ = 423;
    public static final int ARM_INS_MOVS = 424;
    public static final int ARM_INS_POP = 425;
    public static final int ARM_INS_PUSH = 426;
    public static final int ARM_INS_NOP = 427;
    public static final int ARM_INS_YIELD = 428;
    public static final int ARM_INS_WFE = 429;
    public static final int ARM_INS_WFI = 430;
    public static final int ARM_INS_SEV = 431;
    public static final int ARM_INS_SEVL = 432;
    public static final int ARM_INS_VPUSH = 433;
    public static final int ARM_INS_VPOP = 434;
    public static final int ARM_INS_ENDING = 435;

    // Group of ARM instructions

    public static final int ARM_GRP_INVALID = 0;

    // Generic groups
    public static final int ARM_GRP_JUMP = 1;

    // Architecture-specific groups
    public static final int ARM_GRP_CRYPTO = 128;
    public static final int ARM_GRP_DATABARRIER = 129;
    public static final int ARM_GRP_DIVIDE = 130;
    public static final int ARM_GRP_FPARMV8 = 131;
    public static final int ARM_GRP_MULTPRO = 132;
    public static final int ARM_GRP_NEON = 133;
    public static final int ARM_GRP_T2EXTRACTPACK = 134;
    public static final int ARM_GRP_THUMB2DSP = 135;
    public static final int ARM_GRP_TRUSTZONE = 136;
    public static final int ARM_GRP_V4T = 137;
    public static final int ARM_GRP_V5T = 138;
    public static final int ARM_GRP_V5TE = 139;
    public static final int ARM_GRP_V6 = 140;
    public static final int ARM_GRP_V6T2 = 141;
    public static final int ARM_GRP_V7 = 142;
    public static final int ARM_GRP_V8 = 143;
    public static final int ARM_GRP_VFP2 = 144;
    public static final int ARM_GRP_VFP3 = 145;
    public static final int ARM_GRP_VFP4 = 146;
    public static final int ARM_GRP_ARM = 147;
    public static final int ARM_GRP_MCLASS = 148;
    public static final int ARM_GRP_NOTMCLASS = 149;
    public static final int ARM_GRP_THUMB = 150;
    public static final int ARM_GRP_THUMB1ONLY = 151;
    public static final int ARM_GRP_THUMB2 = 152;
    public static final int ARM_GRP_PREV8 = 153;
    public static final int ARM_GRP_FPVMLX = 154;
    public static final int ARM_GRP_MULOPS = 155;
    public static final int ARM_GRP_CRC = 156;
    public static final int ARM_GRP_DPVFP = 157;
    public static final int ARM_GRP_V6M = 158;
    public static final int ARM_GRP_ENDING = 159;
}