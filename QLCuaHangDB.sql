USE [QLCuaHangDB]
GO
/****** Object:  Table [dbo].[chi_tiet_hoa_don]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_hoa_don](
	[ma_hoa_don] [varchar](10) NOT NULL,
	[ma_san_pham] [varchar](10) NOT NULL,
	[don_gia] [float] NOT NULL,
	[so_luong] [int] NOT NULL,
	[chiet_khau] [float] NULL,
	[khuyen_mai] [float] NULL,
	[tien_khach] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_hoa_don] ASC,
	[ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hoa_don]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hoa_don](
	[ma_hoa_don] [varchar](10) NOT NULL,
	[ngay_lap_hoa_don] [datetime2](7) NOT NULL,
	[tong_tien] [float] NOT NULL,
	[ma_khach_hang] [varchar](10) NOT NULL,
	[ma_nhan_vien] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_hoa_don] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[khach_hang]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khach_hang](
	[ma_khach_hang] [varchar](10) NOT NULL,
	[dia_chi] [nvarchar](50) NOT NULL,
	[gioi_tinh] [bit] NOT NULL,
	[so_dien_thoai] [varchar](10) NOT NULL,
	[ten_khach_hang] [nvarchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_khach_hang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[loai_san_pham]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[loai_san_pham](
	[ma_loai_san_pham] [varchar](10) NOT NULL,
	[ten_loai_san_pham] [nvarchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_loai_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nha_cung_cap]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nha_cung_cap](
	[ma_nha_cung_cap] [varchar](10) NOT NULL,
	[dia_chi] [nvarchar](30) NOT NULL,
	[so_dien_thoai] [varchar](10) NOT NULL,
	[tenncc] [nvarchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_nha_cung_cap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhan_vien]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhan_vien](
	[ma_nhan_vien] [varchar](10) NOT NULL,
	[dia_chi] [nvarchar](50) NULL,
	[email] [varchar](50) NULL,
	[gioi_tinh] [bit] NOT NULL,
	[so_dien_thoai] [varchar](10) NOT NULL,
	[ten_nhan_vien] [nvarchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_nhan_vien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[san_pham]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[san_pham](
	[ma_san_pham] [varchar](10) NOT NULL,
	[gia_thanh] [float] NOT NULL,
	[hinh] [varbinary](max) NULL,
	[mau_sac] [nvarchar](10) NOT NULL,
	[size] [nvarchar](10) NOT NULL,
	[so_luong] [int] NOT NULL,
	[ten_san_pham] [nvarchar](30) NOT NULL,
	[ma_loai_san_pham] [varchar](10) NOT NULL,
	[ma_nha_cung_cap] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tai_khoan]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tai_khoan](
	[ma_nhan_vien] [varchar](10) NOT NULL,
	[mat_khau] [varchar](255) NOT NULL,
	[quyen] [varchar](15) NOT NULL,
	[tai_khoan] [varchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_nhan_vien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[thuoc_tinh]    Script Date: 08/12/2021 6:59:51 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[thuoc_tinh](
	[ma_san_pham] [varchar](10) NOT NULL,
	[gia_tri] [nvarchar](30) NULL,
	[ten_thuoc_tinh] [nvarchar](30) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00001', N'SP00003', 320000, 1, 0, 16000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00001', N'SP00005', 320000, 1, 0, 32000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00002', N'SP00002', 320000, 1, 0, 0, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00002', N'SP00037', 320000, 1, 0, 0, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00003', N'SP00059', 1040000, 2, 0, 216000, 2000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00003', N'SP00068', 370000, 1, 0, 271500, 2000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00003', N'SP00069', 400000, 1, 0, 60000, 2000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00004', N'SP00061', 440000, 1, 0, 22000, 500000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00005', N'SP00065', 480000, 1, 0, 24000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00005', N'SP00070', 480000, 1, 0, 48000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00006', N'SP00052', 760000, 2, 0, 114000, 1100000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00006', N'SP00054', 450000, 1, 0, 181500, 1100000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00007', N'SP00056', 490000, 1, 0, 24500, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00007', N'SP00067', 490000, 1, 0, 49000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00008', N'SP00064', 480000, 2, 0, 24000, 1200000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00008', N'SP00067', 370000, 1, 0, 61000, 1200000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00008', N'SP00068', 370000, 1, 0, 42500, 1200000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00009', N'SP00063', 240000, 1, 0, 24000, 500000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00009', N'SP00064', 240000, 1, 0, 12000, 500000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00010', N'SP00021', 570000, 1, 0, 85500, 1700000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00010', N'SP00048', 570000, 1, 0, 57000, 1700000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00010', N'SP00063', 570000, 1, 0, 28500, 1700000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00011', N'SP00018', 390000, 1, 0, 39000, 800000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00011', N'SP00020', 390000, 1, 0, 19500, 800000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00012', N'SP00050', 380000, 1, 0, 19000, 1100000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00012', N'SP00062', 380000, 1, 0, 38000, 1100000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00012', N'SP00069', 380000, 1, 0, 57000, 1100000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00013', N'SP00002', 440000, 1, 0, 44000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00013', N'SP00006', 440000, 1, 0, 22000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00014', N'SP00004', 350000, 1, 0, 52500, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00014', N'SP00032', 350000, 1, 0, 105000, 1000000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00015', N'SP00028', 100000, 1, 0, 5000, 300000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00015', N'SP00052', 100000, 1, 0, 10000, 300000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00015', N'SP00067', 100000, 1, 0, 15000, 300000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00016', N'SP00050', 240000, 1, 0, 36000, 800000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00016', N'SP00056', 240000, 1, 0, 24000, 800000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00016', N'SP00064', 240000, 1, 0, 12000, 800000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00017', N'SP00048', 550000, 1, 0, 0, 1200000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00017', N'SP00055', 550000, 1, 0, 0, 1200000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00018', N'SP00061', 480000, 1, 0, 144000, 900000)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong], [chiet_khau], [khuyen_mai], [tien_khach]) VALUES (N'HD00018', N'SP00065', 480000, 1, 0, 72000, 900000)
GO
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00001', CAST(N'2021-12-08T16:59:08.7260000' AS DateTime2), 608000, N'KH00001', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00002', CAST(N'2021-12-08T16:59:33.7300000' AS DateTime2), 640000, N'KH00002', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00003', CAST(N'2021-12-08T17:00:10.4240000' AS DateTime2), 1538500, N'KH00003', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00004', CAST(N'2021-12-08T17:00:31.1530000' AS DateTime2), 418000, N'KH00003', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00005', CAST(N'2021-12-08T17:01:09.3920000' AS DateTime2), 912000, N'KH00004', N'NV00002')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00006', CAST(N'2021-12-08T17:01:41.7360000' AS DateTime2), 1028500, N'KH00005', N'NV00002')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00007', CAST(N'2021-12-08T17:02:04.0900000' AS DateTime2), 931000, N'KH00006', N'NV00002')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00008', CAST(N'2021-12-08T17:02:30.4190000' AS DateTime2), 1159000, N'KH00007', N'NV00002')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00009', CAST(N'2021-12-08T17:03:03.1190000' AS DateTime2), 456000, N'KH00007', N'NV00003')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00010', CAST(N'2021-12-08T17:03:28.2310000' AS DateTime2), 1624500, N'KH00008', N'NV00003')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00011', CAST(N'2021-12-08T17:03:54.7390000' AS DateTime2), 741000, N'KH00009', N'NV00003')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00012', CAST(N'2021-12-08T17:04:28.1310000' AS DateTime2), 1083000, N'KH00010', N'NV00003')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00013', CAST(N'2021-12-08T17:04:51.8240000' AS DateTime2), 836000, N'KH00011', N'NV00003')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00014', CAST(N'2021-12-08T17:05:11.5690000' AS DateTime2), 595000, N'KH00011', N'NV00003')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00015', CAST(N'2021-12-08T17:05:55.6980000' AS DateTime2), 285000, N'KH00012', N'NV00004')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00016', CAST(N'2021-12-08T17:06:17.8900000' AS DateTime2), 684000, N'KH00013', N'NV00004')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00017', CAST(N'2021-12-08T17:06:44.5420000' AS DateTime2), 1100000, N'KH00014', N'NV00004')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00018', CAST(N'2021-12-08T17:07:07.6060000' AS DateTime2), 816000, N'KH00015', N'NV00004')
GO
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00001', N'Tuy Hòa, Phú Yên', 0, N'0983857722', N'Nguyễn Văn Tuấn')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00002', N'Quận 5, TP.HCM', 0, N'0983552726', N'Hoàng Minh Long')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00003', N'Quận 6, TP.HCM', 0, N'0983552755', N'Lê Thành Nam')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00004', N'Quận 3, TP.HCM', 0, N'3983552721', N'Lê Thành Long')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00005', N'Cao Lãnh, Đồng Tháp', 0, N'0168741533', N'Cao Bảo Minh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00006', N'Cao Lãnh, Đồng Tháp', 0, N'0168738533', N'Cao Văn Chương')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00007', N'Cao Lãnh, Đồng Tháp', 0, N'0168747413', N'Dương Văn Minh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00008', N'Quận 3, TP.HCM', 1, N'0196315411', N'Nguyễn Hồng Ánh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00009', N'Quận 3, TP.HCM', 1, N'0199968413', N'Nguyễn Hồng Đào')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00010', N'Nhà Bè, TP.HCM', 1, N'0974652978', N'Lê Thảo Vy')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00011', N'Nhà Bè, TP.HCM', 1, N'0974592978', N'Nguyễn Thị Bảo Ngọc')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00012', N'Nhà Bè, TP.HCM', 1, N'0974652411', N'Trần Thị Minh Tú')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00013', N'Quận 6, TP.HCM', 0, N'0168733163', N'Trần Nhật Hào')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00014', N'Quận 1, TP.HCM', 0, N'0168732512', N'Đào Bá Lộc')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00015', N'Quận 12, TP.HCM', 0, N'0168737890', N'Huỳnh Văn Lâm')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00016', N'Quận 11, TP.HCM', 0, N'0168732114', N'Trương Khắc Huy')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00017', N'Quận 11, TP.HCM', 0, N'0963451871', N'Nguyễn Trường Thịnh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00018', N'Quận 10, TP.HCM', 1, N'0963452512', N'Kan Bảo Anh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00019', N'Quận 8, TP.HCM', 1, N'0963499859', N'Lê Thị Ánh Vy')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00020', N'Quận 4, TP.HCM', 0, N'0927599859', N'Nguyễn Trọng Trí')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00021', N'Quận 1, TP.HCM', 0, N'0927577879', N'Phạn Nhật Trường')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00022', N'Hóc Môn, TP.HCM', 0, N'0957456189', N'Hồ Bảo Thoại')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00023', N'Quận 2, TP.HCM', 0, N'0957456325', N'Trần Trọng Trí')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00024', N'Quận 4, TP.HCM', 0, N'0956415825', N'Nguyễn Đại')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00025', N'Quận 12, TP.HCM', 1, N'0956417412', N'Trần Thị Minh Thư')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00026', N'Bình Tân, TP.HCM', 1, N'0924617412', N'Lê Thị Mỹ Ngọc')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00027', N'Tân Bình, TP.HCM', 0, N'0924612464', N'Nguyễn Phú Đạt')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00028', N'Bình Thạnh, TP.HCM', 0, N'0123538533', N'Lê Cát Tường')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00029', N'Quận 11, TP.HCM', 1, N'0956419875', N'Dương Thị Thu Thủy')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00030', N'Quận 5, TP.HCM', 0, N'0956596324', N'Lê Văn Minh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00031', N'Quận 7, TP.HCM', 0, N'0956599624', N'Lê Mạnh Tiến')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00032', N'Quận 1, TP.HCM', 1, N'0964125978', N'Đỗ Thúy An')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00033', N'Quận 2, TP.HCM', 1, N'0964123852', N'Lê Văn Bắc')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00034', N'Quận 7, TP.HCM', 0, N'0969658852', N'Nguyễn Văn Lâm')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00035', N'Quận 2, TP.HCM', 0, N'0964123852', N'Lê Văn Bắc')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00036', N'Quận 5, TP.HCM', 0, N'0964122455', N'Lê Hoàng Tuấn')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00037', N'Quận 9, TP.HCM', 0, N'0964122190', N'Đỗ Duy Mạnh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00038', N'Bình Thạnh, TP.HCM', 0, N'0964196321', N'Đặng Văn Lâm')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00039', N'Bình Tân, TP.HCM', 0, N'0964195187', N'Bùi Tiến Dũng')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00040', N'Tân Phú, TP.HCM', 0, N'0964196584', N'Nguyễn Quang Hải')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00041', N'Tân Phú, TP.HCM', 0, N'0964195187', N'Phan Mạnh Quỳnh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00042', N'Quận 3, TP.HCM', 0, N'0964195864', N'Huỳnh Trấn Thành')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00043', N'Quận 3, TP.HCM', 0, N'0964124564', N'Lê Dương Bảo Lâm')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00044', N'Quận 8, TP.HCM', 1, N'0964196518', N'Nguyễn Phương Hằng')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00045', N'Quận 8, TP.HCM', 1, N'0678124125', N'Vũ Thu Phương')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00046', N'Quận 2, TP.HCM', 1, N'0748516984', N'Lê Thị Bé')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00047', N'Gò Vấp, TP.HCM', 1, N'0748958472', N'Trần My')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00048', N'Củ Chi, TP.HCM', 0, N'0965338472', N'Lê Bảo Khánh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00049', N'Nhà Bè, TP.HCM', 0, N'0965393201', N'Nguyễn Tiến Dũng')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00050', N'Quận 5, TP.HCM', 0, N'0942003201', N'Trần Trọng Hoàng')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00051', N'Quận 8, TP.HCM', 1, N'0942526984', N'Cao Thị Hồng')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00052', N'Quận 2, TP.HCM', 0, N'0942084517', N'Phan Hồng Hà')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00053', N'Quận 7, TP.HCM', 0, N'0942041258', N'Huỳnh Tấn Phát')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00054', N'Bình Thạnh, TP.HCM', 1, N'0942212258', N'Hoàng Thị Ngọc Trân')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00055', N'Quận 5, TP.HCM', 0, N'0942524567', N'Phan Tấn Tài')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00056', N'Quận 6, TP.HCM', 0, N'0963654812', N'Nguyễn Phi Long')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00057', N'Quận 11, TP.HCM', 0, N'0963623514', N'Nguyễn Trường Thịnh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00058', N'Quận 12, TP.HCM', 0, N'0963624151', N'Nguyễn Thị Minh Quang')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00059', N'Quận 10, TP.HCM', 1, N'0963621242', N'Nguyễn Thị Minh Dương')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00060', N'Quận 1, TP.HCM', 1, N'0963621541', N'Cao Kỳ Duyên')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00061', N'Quận 11, TP.HCM', 1, N'0924548541', N'Nguyễn Thị Vân Anh')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00062', N'Quận 3, TP.HCM', 1, N'0922145234', N'Lê Thị Hương')
INSERT [dbo].[khach_hang] ([ma_khach_hang], [dia_chi], [gioi_tinh], [so_dien_thoai], [ten_khach_hang]) VALUES (N'KH00063', N'Nhà Bè, TP.HCM', 1, N'0974652411', N'Trần Thị Minh Tú')
GO
INSERT [dbo].[loai_san_pham] ([ma_loai_san_pham], [ten_loai_san_pham]) VALUES (N'LSP0001', N'Áo')
INSERT [dbo].[loai_san_pham] ([ma_loai_san_pham], [ten_loai_san_pham]) VALUES (N'LSP0006', N'Găng tay')
INSERT [dbo].[loai_san_pham] ([ma_loai_san_pham], [ten_loai_san_pham]) VALUES (N'LSP0004', N'Giày')
INSERT [dbo].[loai_san_pham] ([ma_loai_san_pham], [ten_loai_san_pham]) VALUES (N'LSP0007', N'Khăn choàng')
INSERT [dbo].[loai_san_pham] ([ma_loai_san_pham], [ten_loai_san_pham]) VALUES (N'LSP0003', N'Nón')
INSERT [dbo].[loai_san_pham] ([ma_loai_san_pham], [ten_loai_san_pham]) VALUES (N'LSP0002', N'Quần')
INSERT [dbo].[loai_san_pham] ([ma_loai_san_pham], [ten_loai_san_pham]) VALUES (N'LSP0005', N'Vớ')
GO
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0001', N'Binh Thanh, TP.HCM', N'0912345678', N'ML Clothes')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0002', N'Go Vap, TP.HCM', N'0912349725', N'KBA Jean')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0003', N'Đà Nẵng', N'0667846124', N'GiangZO')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0004', N'Cầu Giấy, Hà Nội', N'0667849978', N'Kabalass')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0005', N'Đống Đa, Hà Nội', N'0676499782', N'Xuxu2000')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0006', N'Ba Đình, Hà Nội', N'0999699782', N'Zingzing')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0007', N'Đống Đa, Hà Nội', N'0926789782', N'Nikeel')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0008', N'Thanh Xuân, Hà Nội', N'0924269782', N'Hellooo')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0009', N'Quận 7, TP.HCM', N'0609578945', N'LockMe')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0010', N'Quận 4, TP.HCM', N'0609784945', N'Rasin')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0011', N'Quận 1, TP.HCM', N'0601124945', N'500Rose')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0012', N'Quận 7, TP.HCM', N'0616894945', N'VietGangggg')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0013', N'Sơn Tây, Hà Nội', N'0616897416', N'OzHome')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0014', N'Sơn Tây, Hà Nội', N'0657437416', N'OzHome2')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0015', N'Chương Mỹ, Hà Nội', N'0987437416', N'AXY Man')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0016', N'Gia Lâm, Hà Nội', N'0982575416', N'Gucato')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0017', N'Phú Xuyên, Hà Nội', N'0146875416', N'SugarDaddy')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0018', N'Hà Đông, Hà Nội', N'0785475416', N'SweetHome')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0019', N'Ba Vì, Hà Nội', N'0779535416', N'OKla')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0020', N'Bình Tân, TP.HCM', N'0772457416', N'Odaycobando')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0021', N'Quận 12, TP.HCM', N'0774468416', N'Whynot')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0022', N'Tân Phú, TP.HCM', N'0333953457', N'JackJack')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0023', N'Quận 2, TP.HCM', N'0996253453', N'BMCTee')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0024', N'Hà Đông, Hà Nội', N'0965896514', N'teeZZ')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0025', N'Quận 9, TP.HCM', N'0996284751', N'KalasZ')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0026', N'Quận 9, TP.HCM', N'0965884127', N'NewBalenciaga')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0027', N'Quận 4, TP.HCM', N'0965823371', N'CallMe')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0028', N'Quận 5, TP.HCM', N'0965235771', N'Yatme')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0029', N'Quận 7, TP.HCM', N'0965235670', N'Ziga')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0030', N'Quận 4, TP.HCM', N'0965242572', N'Riott')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0031', N'Tân Bình, TP.HCM', N'0964575624', N'Ula')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0032', N'Bình Tân, TP.HCM', N'0964841597', N'CoolMan')
INSERT [dbo].[nha_cung_cap] ([ma_nha_cung_cap], [dia_chi], [so_dien_thoai], [tenncc]) VALUES (N'NCC0033', N'Quân 12, TP.HCM', N'0987351257', N'HelloWorld')
GO
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00001', N'Quận 8, TP.HCM', N'vanann1135@gmail.com', 0, N'0938475937', N'Nguyễn Văn An')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00002', N'Hau Giang, TP.HCM', N'letuan111@gmail.com', 0, N'0938957392', N'Lê Văn Tuấn')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00003', N'Đường số 7, phường An Lạc, quận Bình Tân, TP.HCM', N'longvan3121@gmail.com', 0, N'0908240833', N'Nguyễn Văn Long')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00004', N'Bình Chánh, TP.HCM', N'phamvanngoc2@gmail.com', 0, N'0908691833', N'Phạm Văn Ngọc')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00005', N'Hóc Môn, TP.HCM', N'ngochang999@gmail.com', 1, N'0908699822', N'Lê Ngọc Hằng')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00006', N'Thạnh Hóa, Long An', N'meomeo955@gmail.com', 1, N'0938468199', N'Nguyễn Ngọc Thảo')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00007', N'Quận 5, TP.HCM', N'trangtrang222@gmail.com', 1, N'0971682495', N'Lê Thu Trang')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00008', N'Quận 9, TP.HCM', N'tuantrannn@gmail.com', 0, N'0971688823', N'Trần Minh Tuấn')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00009', N'Quận 2, TP.HCM', N'datphat2323@gmail.com', 0, N'0971841297', N'Huỳnh Phát Đạt')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00010', N'Bình Tân, TP.HCM', N'longsuperper@gmail.com', 0, N'0938467777', N'Cao Bá Minh Long')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00011', N'Thanh Xuân, Hà Nội', N'embecuong954@gmail.com', 0, N'0908497713', N'La Võ Nhật Cường')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00012', N'Cầu Giấy, Hà Nội', N'phuongnam94@gmail.com', 0, N'0945259127', N'Phan Nam Phương')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00013', N'Quận 7, TP.HCM', N'anhngocanh@gmail.com', 1, N'0901251124', N'Hồ Thị Ngọc Ánh')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00014', N'Bình Tân, TP.HCM', N'truongkhacminh1@gmail.com', 0, N'0901222124', N'Trương Khắc Minh')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00015', N'Bình Tân, TP.HCM', N'truongkhactien51@gmail.com', 0, N'0901999624', N'Trương Khắc Anh Tiến')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00016', N'Gò Vấp, TP.HCM', N'minhngoc99@gmail.com', 0, N'0901678924', N'Hồ Ngọc Minh')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00017', N'Gò Vấp, TP.HCM', N'phongle924@gmail.com', 0, N'0901251124', N'Trương Thành Phong')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00018', N'Gò Vấp, TP.HCM', N'trinhneee63@gmail.com', 1, N'0901228924', N'Nguyễn Thị Diễm')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00019', N'Ba Đình, Hà Nội', N'quynhhanoi24@gmail.com', 1, N'0964851978', N'Đào Thị Ngọc Quỳnh')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00020', N'Gò Vấp, TP.HCM', N'hoang21062001@gmail.com', 0, N'0334773288', N'Nguyễn Viết Hoàng')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien]) VALUES (N'NV00021', N'Bình Tân, TP.HCM', N'longle2305@gmail.com', 0, N'0938992316', N'Lê Hoàng Long')
GO
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00001', 120000, NULL, N'Xám', N'M', 49, N'Áo thun tay lỡ basic', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00002', 120000, NULL, N'Xám', N'L', 45, N'Áo thun tay lỡ basic', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00003', 320000, NULL, N'Nâu đen', N'L', 22, N'Áo thun Polo Fitted', N'LSP0001', N'NCC0001')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00004', 350000, NULL, N'Xanh rêu', N'L', 9, N'Áo thun Polo vải gân', N'LSP0001', N'NCC0006')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00005', 350000, NULL, N'Đen', N'M', 16, N'Áo sơ mi tay ngắn kẻ sọc', N'LSP0001', N'NCC0018')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00006', 440000, NULL, N'Đen', N'30', 5, N'Quần tây ống suông basic', N'LSP0002', N'NCC0021')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00007', 440000, NULL, N'Đen', N'31', 8, N'Quần tây ống suông basic', N'LSP0002', N'NCC0021')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00008', 440000, NULL, N'Đen', N'32', 9, N'Quần tây ống suông basic', N'LSP0002', N'NCC0021')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00009', 250000, NULL, N'Xanh lam', N'L', 12, N'Áo Polo phối màu', N'LSP0001', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00010', 290000, NULL, N'Nâu', N'30', 10, N'Quần Short Loose Form', N'LSP0002', N'NCC0019')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00011', 290000, NULL, N'Nâu', N'31', 15, N'Quần Short Loose Form', N'LSP0002', N'NCC0019')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00012', 330000, NULL, N'Đen', N'32', 22, N'Quần Jean trơn Slim Crop', N'LSP0002', N'NCC0016')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00013', 330000, NULL, N'Đen', N'33', 23, N'Quần Jean trơn Slim Crop', N'LSP0002', N'NCC0016')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00014', 240000, NULL, N'Nâu vàng', N'31', 7, N'Quần Short Cago túi đắp', N'LSP0002', N'NCC0020')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00015', 220000, NULL, N'Xám', N'31', 29, N'Quần vải dài kẻ sọc', N'LSP0002', N'NCC0017')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00016', 220000, NULL, N'Xám', N'32', 28, N'Quần vải dài kẻ sọc', N'LSP0002', N'NCC0017')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00017', 220000, NULL, N'Nâu', N'32', 25, N'Quần vải dài kẻ sọc', N'LSP0002', N'NCC0017')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00018', 490000, NULL, N'Vàng', N'M', 46, N'Áo khoác Jean Hàn Quốc', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00019', 490000, NULL, N'Đỏ', N'L', 31, N'Áo khoác Jean Hàn Quốc', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00020', 390000, NULL, N'Nâu', N'40', 17, N'Sandals da có quai', N'LSP0004', N'NCC0002')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00021', 390000, NULL, N'Nâu', N'41', 19, N'Sandals da có quai', N'LSP0004', N'NCC0002')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00022', 390000, NULL, N'Đen', N'42', 33, N'Sandals dây bắt chéo', N'LSP0004', N'NCC0005')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00023', 390000, NULL, N'Đen', N'43', 37, N'Sandals dây bắt chéo', N'LSP0004', N'NCC0005')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00024', 270000, NULL, N'Đỏ', N'Freesize', 16, N'Nón Caro vành tròn', N'LSP0003', N'NCC0009')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00025', 240000, NULL, N'Trắng', N'Freesize', 23, N'Nón lưỡi trai hình thêu', N'LSP0003', N'NCC0013')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00026', 300000, NULL, N'Đen', N'Freesize', 36, N'Nón tròn không vành', N'LSP0003', N'NCC0014')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00027', 190000, NULL, N'Xanh lam', N'Freesize', 18, N'Nón vành Hàn Quốc', N'LSP0003', N'NCC0014')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00028', 100000, NULL, N'Xám', N'Freesize', 53, N'Vớ trơn giày lười', N'LSP0005', N'NCC0011')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00029', 120000, NULL, N'Đen', N'Freesize', 75, N'Vớ cổ thấp', N'LSP0005', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00030', 130000, NULL, N'Đen', N'Freesize', 68, N'Vớ cổ cao châu âu', N'LSP0005', N'NCC0020')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00031', 410000, NULL, N'Nâu', N'Freesize', 31, N'Khăn choàng len Caro', N'LSP0007', N'NCC0004')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00032', 120000, NULL, N'Đen', N'Freesize', 37, N'Găng tay mùa đông chống nước', N'LSP0006', N'NCC0001')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00033', 120000, NULL, N'Xám', N'Freesize', 38, N'Găng tay hở ngón', N'LSP0006', N'NCC0001')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00034', 550000, NULL, N'Trắng', N'L', 46, N'Áo khoác Bommer Dobby', N'LSP0001', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00035', 550000, NULL, N'Trắng', N'M', 43, N'Áo khoác Bommer Dobby', N'LSP0001', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00036', 590000, NULL, N'Đen', N'M', 17, N'Áo khoác Jean châu âu', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00037', 590000, NULL, N'Đen', N'L', 13, N'Áo khoác Jean châu âu', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00038', 610000, NULL, N'Đen', N'L', 12, N'Áo khoác âu 3 lớp', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00039', 610000, NULL, N'Trắng', N'L', 11, N'Áo khoác âu 3 lớp', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00040', 520000, NULL, N'Nâu', N'L', 15, N'Áo khoác Cardigan', N'LSP0001', N'NCC0007')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00041', 520000, NULL, N'Xám', N'M', 15, N'Áo khoác Cardigan', N'LSP0001', N'NCC0004')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00042', 520000, NULL, N'Xám', N'L', 16, N'Áo khoác Cardigan', N'LSP0001', N'NCC0004')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00043', 430000, NULL, N'Trắng', N'M', 38, N'Áo sơ mi tày dài kẻ sọc', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00044', 430000, NULL, N'Trắng', N'L', 38, N'Áo sơ mi tày dài kẻ sọc', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00045', 370000, NULL, N'Hồng nhạt', N'31', 50, N'Quần Short trơn Châu Âu', N'LSP0002', N'NCC0007')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00046', 370000, NULL, N'Đen', N'29', 48, N'Quần Short Jean', N'LSP0002', N'NCC0011')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00047', 550000, NULL, N'Nâu', N'L', 59, N'Áo khoác gió 2 lớp', N'LSP0001', N'NCC0004')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00048', 550000, NULL, N'Xám', N'L', 58, N'Áo khoác gió 2 lớp', N'LSP0001', N'NCC0004')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00049', 600000, NULL, N'Nâu', N'M', 40, N'Áo khoác thể thao cao cấp', N'LSP0001', N'NCC0005')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00050', 380000, NULL, N'Xanh', N'30', 28, N'Quần ngố Kaki', N'LSP0002', N'NCC0016')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00051', 380000, NULL, N'Xanh', N'31', 29, N'Quần ngố Kaki', N'LSP0002', N'NCC0016')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00052', 380000, NULL, N'Xanh', N'32', 26, N'Quần ngố Kaki', N'LSP0002', N'NCC0016')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00053', 450000, NULL, N'Đen', N'M', 659, N'Áo Polo King Mark', N'LSP0001', N'NCC0018')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00054', 450000, NULL, N'Đen', N'L', 659, N'Áo Polo King Mark', N'LSP0001', N'NCC0018')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00055', 490000, NULL, N'Vàng nâu', N'M', 38, N'Áo sơ mi Beach Vibes', N'LSP0001', N'NCC0006')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00056', 490000, NULL, N'Vàng nâu', N'L', 35, N'Áo sơ mi Beach Vibes', N'LSP0001', N'NCC0006')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00057', 490000, NULL, N'Đen', N'40', 26, N'Giày tây nam công sở', N'LSP0004', N'NCC0031')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00058', 490000, NULL, N'Đen', N'41', 27, N'Giày tây nam công sở', N'LSP0004', N'NCC0031')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00059', 520000, NULL, N'Trắng', N'41', 54, N'Giày thể thao cao cấp', N'LSP0004', N'NCC0032')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00060', 520000, NULL, N'Trắng', N'42', 57, N'Giày thể thao cao cấp', N'LSP0004', N'NCC0032')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00061', 440000, NULL, N'Nâu', N'41', 35, N'Giày da lộn phối lưới', N'LSP0004', N'NCC0029')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00062', 440000, NULL, N'Nâu', N'42', 39, N'Giày da lộn phối lưới', N'LSP0004', N'NCC0029')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00063', 570000, NULL, N'Nâu', N'L', 38, N'Áo khoác da nam Timan', N'LSP0001', N'NCC0028')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00064', 240000, NULL, N'Xanh rêu', N'Freesize', 39, N'Nón len trùm đầu', N'LSP0003', N'NCC0031')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00065', 480000, NULL, N'Đỏ', N'L', 27, N'Sơ mi nhung tằm', N'LSP0001', N'NCC0030')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00066', 370000, NULL, N'Xanh', N'31', 47, N'Quần Jean rách gối', N'LSP0002', N'NCC0026')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00067', 370000, NULL, N'Xanh', N'32', 43, N'Quần Jean rách gối', N'LSP0002', N'NCC0026')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00068', 370000, NULL, N'Xanh', N'33', 45, N'Quần Jean rách gối', N'LSP0002', N'NCC0026')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00069', 400000, NULL, N'Đen', N'31', 18, N'Quần Jean ống suông', N'LSP0002', N'NCC0027')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00070', 230000, NULL, N'Trắng', N'L', 47, N'Áo thun họa tiết', N'LSP0001', N'NCC0029')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00071', 230000, NULL, N'Trắng', N'XL', 43, N'Áo thun họa tiết', N'LSP0001', N'NCC0029')
GO
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00001', N'$2a$10$lDN2brjjhbXfD.UomaQ/7OUBpVcwRZQIkXAiAnHhOWfDIrErr/XNe', N'ROLE_QUANLY', N'quanlycuahang')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00002', N'$2a$10$ufeJdqB8CmI6T5q8CMzXOeUawe6t1z.ZHYIrgy9POZrdmdsLGNrWe', N'ROLE_NHANVIEN', N'TK00002')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00003', N'$2a$10$ZIGQs5U6GQC5uLe66hPbbOeohuN5Mxl4bPQNDIKOJcOhhK7tjf6nK', N'ROLE_NHANVIEN', N'TK00003')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00004', N'$2a$10$PZCy5CStTXbebQMozc5BAeF6vuG37Xg4y5mvc36Rm7SWzIAOxu0rW', N'ROLE_NHANVIEN', N'TK00004')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00005', N'$2a$10$XjR1.QuWq9S5q8/XGXTgbOCjDqsV6f9d8YbpQWUXU3.YU6xvTNEwy', N'ROLE_NHANVIEN', N'TK00005')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00006', N'$2a$10$bWlBSNBSSiA00RfRMRxuPO2W.HkYsQbVBTltD42JT.JwNg9TzvBJO', N'ROLE_NHANVIEN', N'TK00006')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00007', N'$2a$10$SbqgI0O1JXJEDbR.0SU.u.h3B6M276lgqj1fqlBhITKGDf6P7Z0P6', N'ROLE_NHANVIEN', N'TK00007')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00008', N'$2a$10$7KmVE/hgyZuu.4yrOMBDzeHZ5SoBaEUioZcuCBujg4sFAcHqjyNy2', N'ROLE_NHANVIEN', N'TK00008')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00009', N'$2a$10$Ht8TvbOiLxJzLtqGzqO8mO1jT8Q2BxHRHrN3JmsC7Pee6K9LcU6ZS', N'ROLE_NHANVIEN', N'TK00009')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00010', N'$2a$10$Wb.ZBWzLN3c4x2cLQYmgauuHMER3923TAt7i.20M5m1Xljv6h9S/S', N'ROLE_NHANVIEN', N'TK00010')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00011', N'$2a$10$lD5R33kTQ3BGWPxZ8jBkMuYWCbCC2fV4oW3tvwYBHVgyMYHRDXagW', N'ROLE_NHANVIEN', N'TK00011')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00012', N'$2a$10$YjGJPpWWgKLB4cCgJHhKOuPKU6FWnKd1LyeKfNG.1D.aRp3Uq0LSO', N'ROLE_NHANVIEN', N'TK00012')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00013', N'$2a$10$ekKtmBhg/2ha6GF64kYyYuCHqv2cDaLq1mWKMEZ7v5Kg2wPEdsyt6', N'ROLE_NHANVIEN', N'TK00013')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00014', N'$2a$10$xc99MH61HHMl4AB4RJ1MOud3d.S29lVldl3PVLoG3VVsadStIY/n6', N'ROLE_NHANVIEN', N'TK00014')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00015', N'$2a$10$DE8idcsF9GjyTFDcfZgkIuodSUS/ek5IXcQr/Om5Lj.20MSGp5it.', N'ROLE_NHANVIEN', N'TK00015')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00016', N'$2a$10$ws6zcD/.7HkT9fxtrfGZquKebhse4DZ4m5e1RsZoX9xlYrdo78fUK', N'ROLE_NHANVIEN', N'TK00016')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00017', N'$2a$10$T.6E1/20km4AyaLvUiLkNuXqnohLghJ2TUjY/OJPyj2NOlYaOXLla', N'ROLE_NHANVIEN', N'TK00017')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00018', N'$2a$10$UlWT4puT2n0dHPNomrJnAOJxAr2XtxQQ2UT3Vuz7kOjsY93VhKbEu', N'ROLE_NHANVIEN', N'TK00018')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00019', N'$2a$10$.HMMXKGfl4Uwai/Nb.RrSeJltq/wb.Bn2w366lfcWT09PGrqCqMz6', N'ROLE_NHANVIEN', N'TK00019')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00020', N'$2a$10$eJkDRxuNn0ODgDCXn9wxROGZ67t9HdKMVHTVuADv4sOeiisiy5/XO', N'ROLE_NHANVIEN', N'TK00020')
INSERT [dbo].[tai_khoan] ([ma_nhan_vien], [mat_khau], [quyen], [tai_khoan]) VALUES (N'NV00021', N'$2a$10$XSizblejMZ/00su6rcUmfu0uSIukBNBHubWEs2kxnWttJ8I/AUlLC', N'ROLE_NHANVIEN', N'TK00021')
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_r5rg5xaay5318n1ux0fwt7gww]    Script Date: 08/12/2021 6:59:51 CH ******/
ALTER TABLE [dbo].[loai_san_pham] ADD  CONSTRAINT [UK_r5rg5xaay5318n1ux0fwt7gww] UNIQUE NONCLUSTERED 
(
	[ten_loai_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_o6u9sw7nwatlx0v0fdgn645qe]    Script Date: 08/12/2021 6:59:51 CH ******/
ALTER TABLE [dbo].[nha_cung_cap] ADD  CONSTRAINT [UK_o6u9sw7nwatlx0v0fdgn645qe] UNIQUE NONCLUSTERED 
(
	[tenncc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_305igniyu4h3d9i4h925yasfj]    Script Date: 08/12/2021 6:59:51 CH ******/
ALTER TABLE [dbo].[tai_khoan] ADD  CONSTRAINT [UK_305igniyu4h3d9i4h925yasfj] UNIQUE NONCLUSTERED 
(
	[tai_khoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[chi_tiet_hoa_don]  WITH CHECK ADD  CONSTRAINT [FK2vqk43lkoa5rm4f7meu8d2cud] FOREIGN KEY([ma_san_pham])
REFERENCES [dbo].[san_pham] ([ma_san_pham])
GO
ALTER TABLE [dbo].[chi_tiet_hoa_don] CHECK CONSTRAINT [FK2vqk43lkoa5rm4f7meu8d2cud]
GO
ALTER TABLE [dbo].[chi_tiet_hoa_don]  WITH CHECK ADD  CONSTRAINT [FKk49dolcd69qi88u6a25i9x2e] FOREIGN KEY([ma_hoa_don])
REFERENCES [dbo].[hoa_don] ([ma_hoa_don])
GO
ALTER TABLE [dbo].[chi_tiet_hoa_don] CHECK CONSTRAINT [FKk49dolcd69qi88u6a25i9x2e]
GO
ALTER TABLE [dbo].[hoa_don]  WITH CHECK ADD  CONSTRAINT [FKnuqkgajew2traqcy7umgm7i1g] FOREIGN KEY([ma_khach_hang])
REFERENCES [dbo].[khach_hang] ([ma_khach_hang])
GO
ALTER TABLE [dbo].[hoa_don] CHECK CONSTRAINT [FKnuqkgajew2traqcy7umgm7i1g]
GO
ALTER TABLE [dbo].[hoa_don]  WITH CHECK ADD  CONSTRAINT [FKsh87ilak874fkwk9pw28pafx7] FOREIGN KEY([ma_nhan_vien])
REFERENCES [dbo].[nhan_vien] ([ma_nhan_vien])
GO
ALTER TABLE [dbo].[hoa_don] CHECK CONSTRAINT [FKsh87ilak874fkwk9pw28pafx7]
GO
ALTER TABLE [dbo].[san_pham]  WITH CHECK ADD  CONSTRAINT [FKhvntx142794jjfid39glqsvkk] FOREIGN KEY([ma_nha_cung_cap])
REFERENCES [dbo].[nha_cung_cap] ([ma_nha_cung_cap])
GO
ALTER TABLE [dbo].[san_pham] CHECK CONSTRAINT [FKhvntx142794jjfid39glqsvkk]
GO
ALTER TABLE [dbo].[san_pham]  WITH CHECK ADD  CONSTRAINT [FKq5wrxnao8q0o5kxbeh9tn8wov] FOREIGN KEY([ma_loai_san_pham])
REFERENCES [dbo].[loai_san_pham] ([ma_loai_san_pham])
GO
ALTER TABLE [dbo].[san_pham] CHECK CONSTRAINT [FKq5wrxnao8q0o5kxbeh9tn8wov]
GO
ALTER TABLE [dbo].[tai_khoan]  WITH CHECK ADD  CONSTRAINT [FKtk5618eftaoodbwqveaieqo1x] FOREIGN KEY([ma_nhan_vien])
REFERENCES [dbo].[nhan_vien] ([ma_nhan_vien])
GO
ALTER TABLE [dbo].[tai_khoan] CHECK CONSTRAINT [FKtk5618eftaoodbwqveaieqo1x]
GO
ALTER TABLE [dbo].[thuoc_tinh]  WITH CHECK ADD  CONSTRAINT [FKdwlorpick1a1lckp6p0enppyp] FOREIGN KEY([ma_san_pham])
REFERENCES [dbo].[san_pham] ([ma_san_pham])
GO
ALTER TABLE [dbo].[thuoc_tinh] CHECK CONSTRAINT [FKdwlorpick1a1lckp6p0enppyp]
GO
