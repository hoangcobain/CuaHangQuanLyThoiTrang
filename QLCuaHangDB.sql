USE [QLCuaHangDB]
GO
/****** Object:  Table [dbo].[chi_tiet_hoa_don]    Script Date: 15/11/2021 5:31:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_hoa_don](
	[ma_hoa_don] [varchar](10) NOT NULL,
	[ma_san_pham] [varchar](10) NOT NULL,
	[don_gia] [float] NOT NULL,
	[so_luong] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_hoa_don] ASC,
	[ma_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hoa_don]    Script Date: 15/11/2021 5:31:47 CH ******/
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
/****** Object:  Table [dbo].[khach_hang]    Script Date: 15/11/2021 5:31:47 CH ******/
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
/****** Object:  Table [dbo].[loai_san_pham]    Script Date: 15/11/2021 5:31:47 CH ******/
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
/****** Object:  Table [dbo].[nha_cung_cap]    Script Date: 15/11/2021 5:31:47 CH ******/
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
/****** Object:  Table [dbo].[nhan_vien]    Script Date: 15/11/2021 5:31:47 CH ******/
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
	[ma_tai_khoan] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_nhan_vien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[san_pham]    Script Date: 15/11/2021 5:31:47 CH ******/
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
/****** Object:  Table [dbo].[tai_khoan]    Script Date: 15/11/2021 5:31:47 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tai_khoan](
	[ma_tai_khoan] [varchar](10) NOT NULL,
	[mat_khau] [varchar](255) NOT NULL,
	[quyen] [varchar](15) NOT NULL,
	[tai_khoan] [varchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_tai_khoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[thuoc_tinh]    Script Date: 15/11/2021 5:31:47 CH ******/
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
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00001', N'SP00005', 350000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00001', N'SP00009', 2750000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00001', N'SP00028', 100000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00002', N'SP00022', 780000, 2)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00003', N'SP00030', 260000, 2)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00003', N'SP00036', 590000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00003', N'SP00039', 610000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00003', N'SP00040', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00003', N'SP00042', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00004', N'SP00001', 120000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00004', N'SP00003', 320000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00004', N'SP00006', 440000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00005', N'SP00009', 250000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00005', N'SP00010', 290000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00006', N'SP00020', 390000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00006', N'SP00026', 300000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00006', N'SP00041', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00007', N'SP00033', 120000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00007', N'SP00037', 590000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00007', N'SP00040', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00007', N'SP00041', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00008', N'SP00015', 220000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00008', N'SP00018', 490000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00008', N'SP00019', 490000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00009', N'SP00028', 200000, 2)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00010', N'SP00012', 330000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00010', N'SP00014', 240000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00010', N'SP00038', 1220000, 2)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00010', N'SP00040', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00010', N'SP00041', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00011', N'SP00009', 250000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00011', N'SP00012', 330000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00011', N'SP00017', 220000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00012', N'SP00014', 240000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00012', N'SP00017', 220000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00012', N'SP00023', 390000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00013', N'SP00020', 390000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00013', N'SP00022', 390000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00013', N'SP00024', 270000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00014', N'SP00035', 550000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00014', N'SP00036', 590000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00014', N'SP00039', 610000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00015', N'SP00039', 610000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00015', N'SP00041', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00015', N'SP00042', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00016', N'SP00038', 610000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00017', N'SP00032', 240000, 2)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00017', N'SP00037', 590000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00017', N'SP00041', 520000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00018', N'SP00012', 330000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00018', N'SP00018', 490000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00019', N'SP00002', 120000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00019', N'SP00003', 320000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00019', N'SP00004', 350000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00020', N'SP00010', 290000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00020', N'SP00028', 200000, 2)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00020', N'SP00031', 410000, 1)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00021', N'SP00026', 900000, 3)
INSERT [dbo].[chi_tiet_hoa_don] ([ma_hoa_don], [ma_san_pham], [don_gia], [so_luong]) VALUES (N'HD00021', N'SP00029', 120000, 1)
GO
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00001', CAST(N'2021-11-15T17:06:05.6000000' AS DateTime2), 3040000, N'KH00023', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00002', CAST(N'2021-11-15T17:07:00.6220000' AS DateTime2), 780000, N'KH00001', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00003', CAST(N'2021-11-15T17:07:29.4360000' AS DateTime2), 2125000, N'KH00001', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00004', CAST(N'2021-11-15T17:08:01.0310000' AS DateTime2), 880000, N'KH00002', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00005', CAST(N'2021-11-15T17:08:27.0080000' AS DateTime2), 540000, N'KH00002', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00006', CAST(N'2021-11-15T17:08:52.6800000' AS DateTime2), 1210000, N'KH00002', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00007', CAST(N'2021-11-15T17:09:22.4740000' AS DateTime2), 1662500, N'KH00002', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00008', CAST(N'2021-11-15T17:10:03.0550000' AS DateTime2), 1140000, N'KH00003', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00009', CAST(N'2021-11-15T17:10:18.9890000' AS DateTime2), 200000, N'KH00004', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00010', CAST(N'2021-11-15T17:10:39.9000000' AS DateTime2), 2405500, N'KH00004', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00011', CAST(N'2021-11-15T17:11:00.0180000' AS DateTime2), 800000, N'KH00005', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00012', CAST(N'2021-11-15T17:11:25.4570000' AS DateTime2), 850000, N'KH00006', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00013', CAST(N'2021-11-15T17:11:44.8560000' AS DateTime2), 997500, N'KH00011', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00014', CAST(N'2021-11-15T17:12:21.4540000' AS DateTime2), 1750000, N'KH00011', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00015', CAST(N'2021-11-15T17:12:47.0980000' AS DateTime2), 1650000, N'KH00015', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00016', CAST(N'2021-11-15T17:13:00.8830000' AS DateTime2), 610000, N'KH00015', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00017', CAST(N'2021-11-15T17:13:19.5660000' AS DateTime2), 1282500, N'KH00015', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00018', CAST(N'2021-11-15T17:13:42.3130000' AS DateTime2), 820000, N'KH00024', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00019', CAST(N'2021-11-15T17:14:07.2530000' AS DateTime2), 750500, N'KH00025', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00020', CAST(N'2021-11-15T17:14:40.6290000' AS DateTime2), 900000, N'KH00027', N'NV00001')
INSERT [dbo].[hoa_don] ([ma_hoa_don], [ngay_lap_hoa_don], [tong_tien], [ma_khach_hang], [ma_nhan_vien]) VALUES (N'HD00021', CAST(N'2021-11-15T17:14:59.3090000' AS DateTime2), 969000, N'KH00027', N'NV00001')
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
GO
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00001', N'Quận 6, TP.HCM', N'anhtuuu11@gmail.com', 0, N'0901259745', N'Lê Tự Anh Tú', N'TK00001')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00004', N'Hau Giang, TP.HCM', N'letuan111@gmail.com', 0, N'0938957392', N'Lê Văn Tuấn', N'TK00002')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00005', N'Đường số 7, phường An Lạc, quận Bình Tân, TP.HCM', N'longvan3121@gmail.com', 0, N'0908240833', N'Nguyễn Văn Long', N'TK00003')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00006', N'Bình Chánh, TP.HCM', N'phamvanngoc2@gmail.com', 0, N'0908691833', N'Phạm Văn Ngọc', N'TK00004')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00007', N'Hóc Môn, TP.HCM', N'ngochang999@gmail.com', 1, N'0908699822', N'Lê Ngọc Hằng', N'TK00005')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00008', N'Thạnh Hóa, Long An', N'meomeo955@gmail.com', 1, N'0938468199', N'Nguyễn Ngọc Thảo', N'TK00006')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00009', N'Quận 5, TP.HCM', N'trangtrang222@gmail.com', 1, N'0971682495', N'Lê Thu Trang', N'TK00007')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00010', N'Quận 9, TP.HCM', N'tuantrannn@gmail.com', 0, N'0971688823', N'Trần Minh Tuấn', N'TK00008')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00011', N'Quận 2, TP.HCM', N'datphat2323@gmail.com', 0, N'0971841297', N'Huỳnh Phát Đạt', N'TK00009')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00012', N'Bình Tân, TP.HCM', N'longsuperper@gmail.com', 0, N'0938467777', N'Cao Bá Minh Long', N'TK00010')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00013', N'Thanh Xuân, Hà Nội', N'embecuong954@gmail.com', 0, N'0908497713', N'La Võ Nhật Cường', N'TK00011')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00014', N'Cầu Giấy, Hà Nội', N'phuongnam94@gmail.com', 0, N'0945259127', N'Phan Nam Phương', N'TK00012')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00015', N'Quận 7, TP.HCM', N'anhngocanh@gmail.com', 1, N'0901251124', N'Hồ Thị Ngọc Ánh', N'TK00013')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00016', N'Bình Tân, TP.HCM', N'truongkhacminh1@gmail.com', 0, N'0901222124', N'Trương Khắc Minh', N'TK00014')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00017', N'Bình Tân, TP.HCM', N'truongkhactien51@gmail.com', 0, N'0901999624', N'Trương Khắc Anh Tiến', N'TK00015')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00018', N'Gò Vấp, TP.HCM', N'minhngoc99@gmail.com', 0, N'0901678924', N'Hồ Ngọc Minh', N'TK00016')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00019', N'Gò Vấp, TP.HCM', N'phongle924@gmail.com', 0, N'0901251124', N'Trương Thành Phong', N'TK00017')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00020', N'Gò Vấp, TP.HCM', N'trinhneee63@gmail.com', 1, N'0901228924', N'Nguyễn Thị Diễm', N'TK00018')
INSERT [dbo].[nhan_vien] ([ma_nhan_vien], [dia_chi], [email], [gioi_tinh], [so_dien_thoai], [ten_nhan_vien], [ma_tai_khoan]) VALUES (N'NV00021', N'Ba Đình, Hà Nội', N'quynhhanoi24@gmail.com', 1, N'0964851978', N'Đào Thị Ngọc Quỳnh', N'TK00019')
GO
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00001', 120000, NULL, N'Xám', N'M', 49, N'Áo thun tay lỡ basic', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00002', 120000, NULL, N'Xám', N'L', 49, N'Áo thun tay lỡ basic', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00003', 320000, NULL, N'Nâu đen', N'L', 28, N'Áo thun Polo Fitted', N'LSP0001', N'NCC0001')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00004', 350000, NULL, N'Xanh rêu', N'L', 19, N'Áo thun Polo vải gân', N'LSP0001', N'NCC0006')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00005', 350000, NULL, N'Đen', N'M', 19, N'Áo sơ mi tay ngắn kẻ sọc', N'LSP0001', N'NCC0018')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00006', 440000, NULL, N'Đen', N'30', 9, N'Quần tây ống suông basic', N'LSP0002', N'NCC0021')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00007', 440000, NULL, N'Đen', N'31', 10, N'Quần tây ống suông basic', N'LSP0002', N'NCC0021')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00008', 440000, NULL, N'Đen', N'32', 10, N'Quần tây ống suông basic', N'LSP0002', N'NCC0021')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00009', 250000, NULL, N'Xanh lam', N'L', 17, N'Áo Polo phối màu', N'LSP0001', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00010', 290000, NULL, N'Nâu', N'30', 13, N'Quần Short Loose Form', N'LSP0002', N'NCC0019')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00011', 290000, NULL, N'Nâu', N'31', 15, N'Quần Short Loose Form', N'LSP0002', N'NCC0019')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00012', 330000, NULL, N'Đen', N'32', 25, N'Quần Jean trơn Slim Crop', N'LSP0002', N'NCC0016')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00013', 330000, NULL, N'Đen', N'33', 28, N'Quần Jean trơn Slim Crop', N'LSP0002', N'NCC0016')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00014', 240000, NULL, N'Nâu vàng', N'31', 8, N'Quần Short Cago túi đắp', N'LSP0002', N'NCC0020')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00015', 220000, NULL, N'Xám', N'31', 29, N'Quần vải dài kẻ sọc', N'LSP0002', N'NCC0017')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00016', 220000, NULL, N'Xám', N'32', 30, N'Quần vải dài kẻ sọc', N'LSP0002', N'NCC0017')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00017', 220000, NULL, N'Nâu', N'32', 28, N'Quần vải dài kẻ sọc', N'LSP0002', N'NCC0017')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00018', 490000, NULL, N'Vàng', N'M', 48, N'Áo khoác Jean Hàn Quốc', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00019', 490000, NULL, N'Đỏ', N'L', 34, N'Áo khoác Jean Hàn Quốc', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00020', 390000, NULL, N'Nâu', N'40', 21, N'Sandals da có quai', N'LSP0004', N'NCC0002')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00021', 390000, NULL, N'Nâu', N'41', 23, N'Sandals da có quai', N'LSP0004', N'NCC0002')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00022', 390000, NULL, N'Đen', N'42', 37, N'Sandals dây bắt chéo', N'LSP0004', N'NCC0005')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00023', 390000, NULL, N'Đen', N'43', 39, N'Sandals dây bắt chéo', N'LSP0004', N'NCC0005')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00024', 270000, NULL, N'Đỏ', N'Freesize', 18, N'Nón Caro vành tròn', N'LSP0003', N'NCC0009')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00025', 240000, NULL, N'Trắng', N'Freesize', 25, N'Nón lưỡi trai hình thêu', N'LSP0003', N'NCC0013')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00026', 300000, NULL, N'Đen', N'Freesize', 36, N'Nón tròn không vành', N'LSP0003', N'NCC0014')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00027', 190000, NULL, N'Xanh lam', N'Freesize', 21, N'Nón vành Hàn Quốc', N'LSP0003', N'NCC0014')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00028', 100000, NULL, N'Xám', N'Freesize', 55, N'Vớ trơn giày lười', N'LSP0005', N'NCC0011')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00029', 120000, NULL, N'Đen', N'Freesize', 79, N'Vớ cổ thấp', N'LSP0005', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00030', 130000, NULL, N'Đen', N'Freesize', 68, N'Vớ cổ cao châu âu', N'LSP0005', N'NCC0020')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00031', 410000, NULL, N'Nâu', N'Freesize', 32, N'Khăn choàng len Caro', N'LSP0007', N'NCC0004')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00032', 120000, NULL, N'Đen', N'Freesize', 38, N'Găng tay mùa đông chống nước', N'LSP0006', N'NCC0001')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00033', 120000, NULL, N'Xám', N'Freesize', 39, N'Găng tay hở ngón', N'LSP0006', N'NCC0001')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00034', 550000, NULL, N'Trắng', N'L', 48, N'Áo khoác Bommer Dobby', N'LSP0001', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00035', 550000, NULL, N'Trắng', N'M', 47, N'Áo khoác Bommer Dobby', N'LSP0001', N'NCC0015')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00036', 590000, NULL, N'Đen', N'M', 18, N'Áo khoác Jean châu âu', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00037', 590000, NULL, N'Đen', N'L', 18, N'Áo khoác Jean châu âu', N'LSP0001', N'NCC0010')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00038', 610000, NULL, N'Đen', N'L', 12, N'Áo khoác âu 3 lớp', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00039', 610000, NULL, N'Trắng', N'L', 12, N'Áo khoác âu 3 lớp', N'LSP0001', N'NCC0003')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00040', 520000, NULL, N'Nâu', N'L', 17, N'Áo khoác Cardigan', N'LSP0001', N'NCC0007')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00041', 520000, NULL, N'Xám', N'M', 15, N'Áo khoác Cardigan', N'LSP0001', N'NCC0004')
INSERT [dbo].[san_pham] ([ma_san_pham], [gia_thanh], [hinh], [mau_sac], [size], [so_luong], [ten_san_pham], [ma_loai_san_pham], [ma_nha_cung_cap]) VALUES (N'SP00042', 520000, NULL, N'Xám', N'L', 18, N'Áo khoác Cardigan', N'LSP0001', N'NCC0004')
GO
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00001', N'$2a$10$wcRNKmOq5g0lumNRTF6MW..5Ontr7vUN2LmvLcEy7kanjPG032Ivy', N'ROLE_QUANLY', N'QuanLyCuaHang')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00002', N'$2a$10$ufeJdqB8CmI6T5q8CMzXOeUawe6t1z.ZHYIrgy9POZrdmdsLGNrWe', N'ROLE_NHANVIEN', N'NV00004')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00003', N'$2a$10$ZIGQs5U6GQC5uLe66hPbbOeohuN5Mxl4bPQNDIKOJcOhhK7tjf6nK', N'ROLE_NHANVIEN', N'NV00005')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00004', N'$2a$10$PZCy5CStTXbebQMozc5BAeF6vuG37Xg4y5mvc36Rm7SWzIAOxu0rW', N'ROLE_NHANVIEN', N'NV00006')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00005', N'$2a$10$XjR1.QuWq9S5q8/XGXTgbOCjDqsV6f9d8YbpQWUXU3.YU6xvTNEwy', N'ROLE_NHANVIEN', N'NV00007')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00006', N'$2a$10$bWlBSNBSSiA00RfRMRxuPO2W.HkYsQbVBTltD42JT.JwNg9TzvBJO', N'ROLE_NHANVIEN', N'NV00008')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00007', N'$2a$10$SbqgI0O1JXJEDbR.0SU.u.h3B6M276lgqj1fqlBhITKGDf6P7Z0P6', N'ROLE_NHANVIEN', N'NV00009')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00008', N'$2a$10$7KmVE/hgyZuu.4yrOMBDzeHZ5SoBaEUioZcuCBujg4sFAcHqjyNy2', N'ROLE_NHANVIEN', N'NV00010')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00009', N'$2a$10$Ht8TvbOiLxJzLtqGzqO8mO1jT8Q2BxHRHrN3JmsC7Pee6K9LcU6ZS', N'ROLE_NHANVIEN', N'NV00011')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00010', N'$2a$10$Wb.ZBWzLN3c4x2cLQYmgauuHMER3923TAt7i.20M5m1Xljv6h9S/S', N'ROLE_NHANVIEN', N'NV00012')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00011', N'$2a$10$lD5R33kTQ3BGWPxZ8jBkMuYWCbCC2fV4oW3tvwYBHVgyMYHRDXagW', N'ROLE_NHANVIEN', N'NV00013')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00012', N'$2a$10$YjGJPpWWgKLB4cCgJHhKOuPKU6FWnKd1LyeKfNG.1D.aRp3Uq0LSO', N'ROLE_NHANVIEN', N'NV00014')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00013', N'$2a$10$ekKtmBhg/2ha6GF64kYyYuCHqv2cDaLq1mWKMEZ7v5Kg2wPEdsyt6', N'ROLE_NHANVIEN', N'NV00015')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00014', N'$2a$10$xc99MH61HHMl4AB4RJ1MOud3d.S29lVldl3PVLoG3VVsadStIY/n6', N'ROLE_NHANVIEN', N'NV00016')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00015', N'$2a$10$DE8idcsF9GjyTFDcfZgkIuodSUS/ek5IXcQr/Om5Lj.20MSGp5it.', N'ROLE_NHANVIEN', N'NV00017')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00016', N'$2a$10$ws6zcD/.7HkT9fxtrfGZquKebhse4DZ4m5e1RsZoX9xlYrdo78fUK', N'ROLE_NHANVIEN', N'NV00018')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00017', N'$2a$10$T.6E1/20km4AyaLvUiLkNuXqnohLghJ2TUjY/OJPyj2NOlYaOXLla', N'ROLE_NHANVIEN', N'NV00019')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00018', N'$2a$10$UlWT4puT2n0dHPNomrJnAOJxAr2XtxQQ2UT3Vuz7kOjsY93VhKbEu', N'ROLE_NHANVIEN', N'NV00020')
INSERT [dbo].[tai_khoan] ([ma_tai_khoan], [mat_khau], [quyen], [tai_khoan]) VALUES (N'TK00019', N'$2a$10$.HMMXKGfl4Uwai/Nb.RrSeJltq/wb.Bn2w366lfcWT09PGrqCqMz6', N'ROLE_NHANVIEN', N'NV00021')
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_r5rg5xaay5318n1ux0fwt7gww]    Script Date: 15/11/2021 5:31:47 CH ******/
ALTER TABLE [dbo].[loai_san_pham] ADD  CONSTRAINT [UK_r5rg5xaay5318n1ux0fwt7gww] UNIQUE NONCLUSTERED 
(
	[ten_loai_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_o6u9sw7nwatlx0v0fdgn645qe]    Script Date: 15/11/2021 5:31:47 CH ******/
ALTER TABLE [dbo].[nha_cung_cap] ADD  CONSTRAINT [UK_o6u9sw7nwatlx0v0fdgn645qe] UNIQUE NONCLUSTERED 
(
	[tenncc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_305igniyu4h3d9i4h925yasfj]    Script Date: 15/11/2021 5:31:47 CH ******/
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
ALTER TABLE [dbo].[nhan_vien]  WITH CHECK ADD  CONSTRAINT [FKdpk3u6xuawsiksnkklx1pfeyw] FOREIGN KEY([ma_tai_khoan])
REFERENCES [dbo].[tai_khoan] ([ma_tai_khoan])
GO
ALTER TABLE [dbo].[nhan_vien] CHECK CONSTRAINT [FKdpk3u6xuawsiksnkklx1pfeyw]
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
ALTER TABLE [dbo].[thuoc_tinh]  WITH CHECK ADD  CONSTRAINT [FKdwlorpick1a1lckp6p0enppyp] FOREIGN KEY([ma_san_pham])
REFERENCES [dbo].[san_pham] ([ma_san_pham])
GO
ALTER TABLE [dbo].[thuoc_tinh] CHECK CONSTRAINT [FKdwlorpick1a1lckp6p0enppyp]
GO
